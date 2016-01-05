package com.sumit.practice.tree;

public class MaxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxDepth m = new MaxDepth();
		CreateTree cr = new CreateTree("tree.txt");
		System.out.println(m.maxDepth(cr.getMyTree()));
		
	}

	public int maxDepth(TreeNode tn){
		if(tn == null){
			return 0;
		}
		int left = maxDepth(tn.getLeft());
		int right = maxDepth(tn.getRight());
		if(left >= right){
			return left+1;
		}
		return right+1;
	}
	
	
}
