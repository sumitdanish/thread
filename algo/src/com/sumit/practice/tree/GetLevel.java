package com.sumit.practice.tree;

public class GetLevel {
	public static void main(String[] args) {
		CreateTree cr = new CreateTree("tree.txt");
		GetLevel gl = new GetLevel();
		System.out.println(gl.getLevel(cr.getMyTree(),16,0));
		
	}
	
	public int getLevel(TreeNode tn,int key,int level){
		if(tn == null){
			return 0;
		}
		if(tn.getData() == key){
			return level;
		}
		int lLeft = getLevel(tn.getLeft(), key, level+1);
		int rRIght =getLevel(tn.getRight(), key, level+1); 
		if(lLeft != 0){
			return lLeft;
		}
		return rRIght;
	}
}
