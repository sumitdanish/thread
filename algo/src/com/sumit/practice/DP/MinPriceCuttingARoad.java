package com.sumit.practice.DP;

public class MinPriceCuttingARoad {
	public static void main(String[] args) {
		int[] a = {1,5,8,9,10,17,17,20};
		System.out.println(new MinPriceCuttingARoad().maxPrice(a, a.length));
	}
	
	public int maxPrice(int[] p,int n){
		if(n <= 0){
			return 0;
		}
		int data = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++){
			data = getMax(data, p[i]+maxPrice(p, n-i-1));
		}
		return data;
	}
	
	public int getMax(int a,int b){
		return a > b?a:b;
	}
}
