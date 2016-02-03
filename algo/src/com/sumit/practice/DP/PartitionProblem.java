package com.sumit.practice.DP;

public class PartitionProblem {
	public static void main(String[] args) {
		int[] a = {1, 5, 11, 5};
		int sum = 0;
		for(int i = 0;i<a.length ;i++){
			sum+=a[i];
		}
		PartitionProblem p = new PartitionProblem();
		if(sum % 2 != 0){
			System.out.println("false");
		}
		sum = sum /2;
		 if(p.isPartioned(a, sum,a.length -1)) {
			 System.out.println("Yes");
		 }else{
			 System.out.println("NO");
		 }
	}
	
	public boolean isPartioned(int[] a,int sum,int n){
		if(sum == 0){
			return true;
		}
		if(sum != 0 && n == 0){
			return false;
		}
		if(a[n-1] > sum){
			return isPartioned(a, sum, n-1);
		}
		return isPartioned(a, sum, n-1) || isPartioned(a, sum-a[n-1], n-1);
	}
}
