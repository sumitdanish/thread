package com.sumit.practice.tree;

public class IsHeightBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateTree cr = new CreateTree("tree.txt");
		System.out.println(new IsHeightBalanced().isBalanced(cr.getMyTree()));
	}

	public boolean isBalanced(TreeNode tn){
		if(tn == null){
			return true;
		}
		int lh = height(tn.getLeft());
		int rh = height(tn.getRight());
		if(Math.abs((lh - rh)) <= 1){
			return isBalanced(tn.getLeft()) && isBalanced(tn.getRight());
		}
		return false;
		
	}
	
	
	public int height(TreeNode tn){
		if(tn == null){
			return 0;
		}
		return 1 + getMax(height(tn.getLeft()),height(tn.getRight()));
	}
	public int getMax(int a,int b){
		return a > b ? a : b;
	}
	
	
	
}
