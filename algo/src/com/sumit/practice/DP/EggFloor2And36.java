package com.sumit.practice.DP;


// Not working please try again....

public class EggFloor2And36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new EggFloor2And36().getMinFloor(2, 36));
	}
	
	public int getMinFloor(int ne,int nf){
		if(nf == 1 || nf == 0){
			return nf;
		}
		if(ne == 1){
			return nf;
		}
		int min = Integer.MAX_VALUE;
		for(int i = 1;i<=nf;i++){
			System.out.println("kj");
			int res = getMax(getMinFloor(ne-1, i-1), getMinFloor(ne, nf-i));
			if(res  < min){
				min = res;
			}
		}
		return 1+min;
	}
	
	public int getMax(int a,int b){
		return a > b ? a : b;
	}

}
