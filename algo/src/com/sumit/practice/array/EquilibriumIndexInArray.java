package com.sumit.practice.array;

public class EquilibriumIndexInArray {
	public static void main(String[] args) {
		int[] a = {-7,1,5,2,4,3,0};
		new EquilibriumIndexInArray().equilibrium1(a);
	}
	
	public void equilibrium1(int[] a){
		int left = 0;
		int right = 0;
		int j = 0;
		for(int i = 0;i<a.length;i++){
			for(j = 0;j<i;j++){
				left+=a[j];
			}
			for(j = i+1;j<a.length;j++){
				right+=a[j];
			}
			if(left == right){
				System.out.println(i);
				break;
			}
		}
	}
	
	
	public void equilibrium(int[] a){
		int left = 0;

		int sum = 0;
		int k1 = 0;
		for(int  k = 0;k<a.length;k++){
			sum+=a[k];
		}
		for(int l = 0;l<a.length;l++){
			sum-=a[l];
			if(left == sum){
				k1 = l;
				break;
			}
			left+=a[l];
		}
		System.out.println(k1);
	}
}
