package com.sumit.practice.tree;

public class IsFoldableTree {
	public static void main(String[] args) {

	}

	public boolean isFoldable(TreeNode tnLeft, TreeNode tnRight) {
		if (tnLeft == null && tnRight == null) {
			return true;
		}
		if (tnLeft == null || tnRight == null) {
			return false;
		}
		return isFoldable(tnLeft.getLeft(), tnRight.getRight())
				&& isFoldable(tnLeft.getRight(), tnRight.getLeft());
	}
}
