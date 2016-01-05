package com.sumit.practice.tree;

public class LCAInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree cr = new CreateTree("tree.txt");
		LCAInBST lc = new LCAInBST();
		System.out.println(lc.lca(cr.getMyTree(),11, 9).getData());
	}

	public TreeNode lca(TreeNode tn,int d1,int d2){
		if(tn == null){
			return tn;
		}
		if(tn.getData() > d1 && tn.getData() > d2){
			return lca(tn.getLeft(),d1,d2);
		}
		if(tn.getData() < d1 && tn.getData() < d2){
			return lca(tn.getRight(),d1,d2);
		}
		return tn;
	}
	
	
}
