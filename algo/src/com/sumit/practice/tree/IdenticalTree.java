package com.sumit.practice.tree;

public class IdenticalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree cr1 = new CreateTree("tree.txt");
		CreateTree cr2 = new CreateTree("tree1.txt");
		TreeNode tr1 = cr1.getMyTree();
		TreeNode tr2 = cr2.getMyTree();
		IdenticalTree id = new IdenticalTree();
		if(id.isIdentical(tr1, tr2)){
			System.out.println("Identical");
		}else{
			System.out.println("! Identical");
		}
	}

	
	public boolean isIdentical(TreeNode tn1,TreeNode tn2){
		if(tn1 == null && tn2 == null){
			return true;
		}
		if(tn1.getData() == tn2.getData()){
			return (isIdentical(tn1.getLeft(), tn2.getLeft())
					&& isIdentical(tn1.getRight(), tn2.getRight()));
		}
		return false;
	}
	
	
}
