package com.sumit.practice.tree;

public class PrintToLeafPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree cr = new CreateTree("tree.txt");
		PrintToLeafPath pr = new PrintToLeafPath();
		pr.printPath(cr.getMyTree(),0,new int[100]);
	}

	
	public void printPath(TreeNode tn,int index,int[] pa){
		if(tn == null){
			return;
		}
		pa[index++] = tn.getData();
		if(tn.getLeft() == null && tn.getRight() == null){
			for(int i = 0;i<index;i++){
				System.out.print(pa[i]+",");
			}
			index = 0;
			System.out.println();
		}
		printPath(tn.getLeft(), index, pa);
		printPath(tn.getRight(), index, pa);
	}
	
	
}
