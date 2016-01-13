package com.sumit.practice.tree;

public class IsSubTree {
	public static void main(String[] args) {
		
		CreateTree cr1 = new CreateTree("tree.txt");
		CreateTree cr2 = new CreateTree("tree3.txt");
		TreeNode tr1 = cr1.getMyTree();
		TreeNode tr2 = cr2.getMyTree();
		System.out.println(new IsSubTree().isSubTree(tr1, tr2));
		
	}
	
	public boolean compare(TreeNode tn1,TreeNode tn2){
		if(tn1 == null && tn2 == null){
			return true;
		}
		if(tn1 == null || tn2 == null){
			return false;
		}
		
		return tn1.getData() == tn2.getData() && compare(tn1.getLeft(), tn2.getLeft()) && compare(tn1.getRight(), tn2.getRight());
	}
	
	public boolean isSubTree(TreeNode tn1,TreeNode tn2){
		if(tn1 == null){
			return false;
		}
		if(compare(tn1, tn2)){
			return true;
		}
		return isSubTree(tn1.getLeft(), tn2) || isSubTree(tn1.getRight(), tn2);
	}
}


