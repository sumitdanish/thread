package com.sumit.practice.tree;

public class MaxWidth {

	public static void main(String[] args) {
		CreateTree cr = new CreateTree("tree.txt");
		MaxWidth ma = new MaxWidth();
		System.out.println(ma.getWidth(cr.getMyTree()));
	}
	
	public int getWidth(TreeNode tn){
		int max = Integer.MIN_VALUE;
		for(int i = 1;i<=getHeight(tn);i++){
			int width = getMaxWidth(tn,i);
			if(max < width){
				max = width;
			}
		}
		return max;
	}
	
	
	public int getMaxWidth(TreeNode tn,int level){
		if(tn == null){
			return 0;
		}
		if(level == 1){
			return 1;
		}
		return(getMaxWidth(tn.getLeft(), level-1)+getMaxWidth(tn.getRight(), level-1));
	}
	
	
	public int getHeight(TreeNode tn){
		if(tn == null){
			return 0;
		}
		return 1 + getMax(getHeight(tn.getLeft()),getHeight(tn.getRight()));
	}
	
	public int getMax(int a,int b){
		return a > b ? a : b;
	}
}
