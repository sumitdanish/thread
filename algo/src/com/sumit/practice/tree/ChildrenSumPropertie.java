package com.sumit.practice.tree;

public class ChildrenSumPropertie {

	public static void main(String[] args) {
		// TODO Auto-gar
		CreateTree cr = new CreateTree("tree.txt");
		ChildrenSumPropertie ch  = new ChildrenSumPropertie();
		TreeNode tr = cr.getMyTree();
		cr.inOrder(tr);
		System.out.println();
		ch.chidrenSumPropertie(tr);
		cr.inOrder(tr);
	}

	
	/*
	 * If node contains left child and right child null then that node holds 0 value
	 *  
	 * 
	 */
	
	public void chidrenSumPropertie(TreeNode tn){
		int diff = 0;
		int lSum = 0;
		int rSum = 0;
		if(tn == null){
			return;
		}
		if(tn.getLeft() == null && tn.getRight() == null){
			return;
		}
		chidrenSumPropertie(tn.getLeft());
		chidrenSumPropertie(tn.getRight());
		if(tn.getLeft() != null){
			lSum = tn.getLeft().getData();
		}
		if(tn.getRight() != null){
			rSum = tn.getRight().getData();
		}
		diff = lSum+rSum;
		tn.setData(diff);
	}
	
	public void expandTree(TreeNode tn,int diff){
		if(tn == null){
			return;
		}
		if(tn.getLeft() != null){
			tn.getLeft().setData(diff+tn.getLeft().getData());
			expandTree(tn.getLeft(), diff);
		}
		if(tn.getRight()!=null){
			tn.getRight().setData(tn.getRight().getData()+diff);
			expandTree(tn.getRight(), diff);
		}
		
	}
	
	
}
