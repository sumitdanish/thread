package com.sumit.practice.tree;

public class NumberOfTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {2,3};
		System.out.println(new NumberOfTrees().cata(i.length));
	}

	
	public int cata(int n){
		if(n<=1){
			return 1;
		}
		int res = 0;
		for(int i = 0;i<n;i++){
			res+=cata(i)*cata(n-i-1);
		}
		return res;
	}
	
	
}
