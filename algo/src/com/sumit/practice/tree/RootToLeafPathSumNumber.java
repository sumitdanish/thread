package com.sumit.practice.tree;

public class RootToLeafPathSumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree cr = new CreateTree("tree.txt");
		RootToLeafPathSumNumber r = new RootToLeafPathSumNumber();
		System.out.println(r.isPathSum(cr.getMyTree(),9));
	}
	
	public boolean isPathSum(TreeNode tn,int sum){
		if(tn == null){
			return true;
		}
		int da = 0;
		da = sum - tn.getData();
		if(da == 0 && tn.getLeft() == null && tn.getRight() == null){
			///da = 0;
			return true;
		}
		if(tn.getLeft() != null){
			return isPathSum(tn.getLeft(),da);
		}
		if(tn.getRight() != null){
			return isPathSum(tn.getRight(), da);
		}
		return false;
		
	}

}
