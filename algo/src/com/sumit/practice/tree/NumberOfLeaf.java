package com.sumit.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfLeaf {

	public static void main(String[] args) {
		// TODO Auto-gateenerated method stub
		CreateTree cr = new CreateTree("tree.txt");
		NumberOfLeaf n = new NumberOfLeaf();
		System.out.println(n.number(cr.getMyTree()));
	}

	public int numberofLeaf(TreeNode tn){
		if(tn == null){
			return 0;
		}
		
		return (tn.getLeft() == null && tn.getRight() == null) ?0: 1+(numberofLeaf(tn.getLeft())+numberofLeaf(tn.getRight()));
		/*if(tn.getLeft() == null && tn.getRight() == null){
			return 1;
		}
		return numberofLeaf(tn.getLeft())+numberofLeaf(tn.getRight());*/
		
	}
	
	
	public int number(TreeNode tn){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(tn);
		int count = 0;
		while(!q.isEmpty()){
			tn = q.poll();
			if(tn.getLeft() == null && tn.getRight() == null){
				count++;
			}
			if(tn.getLeft() != null){
				q.add(tn.getLeft());
			}
			if(tn.getRight() != null){
				q.add(tn.getRight());
			}
		}
		return count;
	}
	
	
}
