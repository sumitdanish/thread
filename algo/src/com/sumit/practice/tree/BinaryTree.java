package com.sumit.practice.tree;

public class BinaryTree {
	TreeNode tree;
	public BinaryTree(){
		tree = new TreeNode(8);
		tree.setLeft(new TreeNode(5));
		tree.setRight(new TreeNode(4));
		tree.getLeft().setLeft(new TreeNode(9));
		tree.getRight().setRight(new TreeNode(11));
		tree.getRight().getRight().setLeft(new TreeNode(3));
		tree.getLeft().setRight(new TreeNode(7));
		tree.getLeft().getRight().setRight(new TreeNode(12));
		tree.getLeft().getRight().getRight().setLeft(new TreeNode(2));
		tree.getLeft().getRight().setLeft(new TreeNode(1));
	}
	
	public TreeNode getBinaryTree(){
		return tree;
	}
	
}
