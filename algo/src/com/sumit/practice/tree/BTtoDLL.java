package com.sumit.practice.tree;

public class BTtoDLL {

	TreeNode pre = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree cr = new CreateTree("tree.txt");
		TreeNode tr = cr.getMyTree();
		BTtoDLL bt = new BTtoDLL();
		bt.fixLeftPointer(tr);
		TreeNode tr1 = bt.fixRightPointer(tr);
		bt.print(tr1);
	}
	
	public void print(TreeNode tr){
		if(tr==null){
			return;
		}
		System.out.print(tr.getData()+",");
		print(tr.getRight());
	}
	
	public void fixLeftPointer(TreeNode tn){
		if(tn != null){
			fixLeftPointer(tn.getLeft());
			tn.setLeft(pre);
			pre = tn;
			fixLeftPointer(tn.getRight());
		}
	}
	
	public TreeNode fixRightPointer(TreeNode tn){
		if(tn == null){
			return tn;
		}
		TreeNode pre = null;
		while(tn != null && tn.getRight() != null){
			tn = tn.getRight();
		}
		while(tn != null && tn.getLeft() != null){
			pre= tn;
			tn = tn.getLeft();
			tn.setRight(pre);
		}
		return tn;
	}
	
	
	
	
}
