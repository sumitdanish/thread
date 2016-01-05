package com.sumit.practice.tree;

public class MirrorImage {

	public static void main(String[] args){
		
		CreateTree cr = new CreateTree("tree.txt");
		MirrorImage mr = new MirrorImage();
		TreeNode tr = cr.getMyTree();
		cr.inOrder(tr);
		System.out.println();
		mr.mirrorImage(tr);
		cr.inOrder(tr);
	}
	
	
	public void mirrorImage(TreeNode tr){
		if(tr == null){
			return;
		}
		mirrorImage(tr.getLeft());
		mirrorImage(tr.getRight());
		TreeNode tr1 = tr.getLeft();
		tr.setLeft(tr.getRight());
		tr.setRight(tr1);
	}
	
	
}
