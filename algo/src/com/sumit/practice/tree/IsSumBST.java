package com.sumit.practice.tree;

public class IsSumBST {
	public static void main(String[] args) {
		CreateTree cr = new CreateTree("tree.txt");
		IsSumBST si = new IsSumBST();
		System.out.println(si.isSumBST(cr.getMyTree()));
	}
	
	public boolean isSumBST(TreeNode tn){
		if(tn == null){
			return true;
		}
		int ls = sum(tn.getLeft());
		int rs = sum(tn.getRight());
		return (ls == rs && isSumBST(tn.getLeft()) && isSumBST(tn.getRight()));
	}
	
	public int sum(TreeNode tn){
		if(tn == null){
			return 0;
		}
		return tn.getData()+sum(tn.getLeft())+sum(tn.getRight());
	}
}
