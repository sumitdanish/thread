package com.sumit.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevel {

	
	public static void main(String[] args){
		CreateTree cr = new CreateTree("tree.txt");
		TreeLevel tl = new TreeLevel();
		TreeNode tr = cr.getMyTree();
		//cr.inOrder(tr);
		tl.levelOrder(tr);
		/*int level = tl.getLevel(tr, 11,0);
		System.out.println(level);*/
	} 
	
	private int getLevel(TreeNode tr,int data,int level){
		if(tr == null){
			return 0;
		}
		if(tr.getData() == data){
			return level;
		}
		int le = getLevel(tr.getLeft(), data, level+1);
		if(le != 0){
			return le;
		}
		return getLevel(tr.getRight(), data, level+1);
	}
	
	private void levelOrder(TreeNode tr){
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		qu.add(tr);
		while(!qu.isEmpty()){
			tr = qu.poll();
			System.out.print(tr.getData()+"->");
			if(tr.getLeft() != null){
				qu.add(tr.getLeft());
			}
			if(tr.getRight() != null){
				qu.add(tr.getRight());
			}
		}
	}
	
}
