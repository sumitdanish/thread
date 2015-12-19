package com.sumit.practice;

public class LongestIncreasingSubsequence {

	public static int max = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a  = {10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int maxLen = -1;
		int n = 1;
		//System.out.println(new LongestIncreasingSubsequence().lcs(a, a.length, maxLen));
		new LongestIncreasingSubsequence().lcs1(a);
	}

	public int lcs(int[] a,int n,int maxLen){
		if(n == 1){
			return 1;
		}
		int res = 1;
		int max_end = 1;
		for(int i = 1;i<n;i++){
			res = lcs(a, i,maxLen);
			if(a[n-1] > a[i-1] && 1+res > max_end){
				max_end = 1+res;
			}
		}
		if(maxLen < max_end){
			maxLen = max_end;
		}
		return maxLen;
	}
	
	public void lcs1(int[] a){
		int[] lcs = new int[a.length+1];
		int max_len = 0;
		for(int i = 0;i<a.length;i++){
			lcs[i] = 1;
		}
		
		for(int i = 1;i<a.length;i++){
			for(int j = 0;j<i;j++){
				if(a[i] > a[j] && 1+lcs[j] > lcs[i]){
					lcs[i] = 1+lcs[j]; 
				}
			}
		}
		for(int i = 0;i<lcs.length;i++){
			if(max_len < lcs[i]){
				max_len = lcs[i];
			}
		}
		
		System.out.println("Max Lenght : "+max_len);
	}
	
	public int getMax(int a,int b){
		return (a>b?a:b);
	}
}
