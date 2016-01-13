package com.sumit.practice.tree;

public class DoubleTree {

	public static void main(String[] args) {
		CreateTree cr = new CreateTree("tree2.txt");
		TreeNode tn = cr.getMyTree();
		DoubleTree d = new DoubleTree();
		cr.inOrder(tn);
		System.out.println();
		d.doubleTree(tn);
		cr.inOrder(tn);
	}
	
	
	public void doubleTree(TreeNode tn){
		if(tn == null){
			return;
		}
		doubleTree(tn.getLeft());
		doubleTree(tn.getRight());
		TreeNode old = tn.getLeft();
		TreeNode newNode = new TreeNode(tn.getData());
		newNode.setLeft(old);
		tn.setLeft(newNode);
	}
	
	
}
