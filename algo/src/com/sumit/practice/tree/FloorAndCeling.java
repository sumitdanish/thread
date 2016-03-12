package com.sumit.practice.tree;

public class FloorAndCeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree cr = new CreateTree("tree.txt");
		TreeNode tn = cr.getMyTree();
		FloorAndCeling fl = new FloorAndCeling();
		for(int i = 0;i<12;i++){
			System.out.println(fl.Celing(tn, i));
		}
	}
	
	public int Celing(TreeNode tn,int key){
		if(tn == null){
			return -1;
		}
		if(tn.getData() == key){
			return tn.getData();
		}
		if(tn.getData() < key){
			return Celing(tn.getRight(),key);
		}
		int ce = Celing(tn.getLeft(), key);
		if(key < ce){
			return ce;
		}
		return tn.getData();
	}
}
