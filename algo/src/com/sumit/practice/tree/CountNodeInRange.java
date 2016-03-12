package com.sumit.practice.tree;

public class CountNodeInRange {

	static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode bt = new BinaryTree().getBinaryTree();
		CountNodeInRange c = new CountNodeInRange();
		c.countNode(bt, 1, 4, count);
		System.out.println(count);
		
	}

	
	public boolean countNode(TreeNode tn,int n1,int n2,int count){
		if(tn == null){
			return true;
		}
		boolean lCount = countNode(tn.getLeft(), n1, n2, count);
		boolean rCount = countNode(tn.getRight(), n1, n2, count);
		if(lCount && rCount && n1 < tn.getData() && tn.getData() < n2){
			count++;
			return true;
		}
		return false;
	}
	
	
}
