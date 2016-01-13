package com.sumit.practice.tree;

public class Diameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree cr = new CreateTree("tree.txt");
		TreeNode tn = cr.getMyTree();
		Diameter d = new Diameter();
		System.out.println(d.diameter(tn));
	}
	
	public int diameter(TreeNode tn){
		if(tn == null){
			return 0;
		}
		
		int lh = height(tn.getLeft());
		int rh = height(tn.getRight());
		int ld = diameter(tn.getLeft());
		int rd = diameter(tn.getRight());
		return getMax((lh+rh+1), getMax(ld,rd));
	}
	
	public int height(TreeNode tn){
		if(tn == null){
			return 0;
		}
		return 1 + getMax(height(tn.getLeft()),height(tn.getRight()));
	}
	
	public int getMax(int a,int b){
		return a > b ? a: b;
	}
	
	
}

