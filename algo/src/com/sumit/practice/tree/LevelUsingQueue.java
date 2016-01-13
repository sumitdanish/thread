package com.sumit.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelUsingQueue {

	public static void main(String[] args) {
		CreateTree cr = new CreateTree("tree.txt");
		LevelUsingQueue le = new LevelUsingQueue();
		//System.out.println(le.level(cr.getMyTree(),2));
		le.inGivenLevel(cr.getMyTree(),2);
	}
	
	public int level(TreeNode tn,int le){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> qi = new LinkedList<Integer>();
		q.add(tn);
		qi.add(0);
		int lev = 0;
		while(true){
			if(q.isEmpty()){
				return lev;
			}
			lev = qi.poll();
			tn = q.poll();
			/*
			 * print node in given level
			 */ 
			 /* if(lev == le){
				System.out.print(tn.getData()+",");
			}*/
			if(tn.getLeft() != null){
				q.add(tn.getLeft());
				qi.add(lev+1);
			}
			if(tn.getRight() != null){
				q.add(tn.getRight());
				qi.add(lev+1);
			}
		}
	}
	
	public void inGivenLevel(TreeNode tn,int k){
		if(tn == null){
			return;
		}
		if(k == 0){
			System.out.print(tn.getData()+",");
		}
		inGivenLevel(tn.getLeft(), k-1);
		inGivenLevel(tn.getRight(), k-1);
	}
}
