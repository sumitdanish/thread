package com.sumit.practice.array;

public class Sort0s1s2s {
	public static void main(String[] args) {
		int[] a =  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		new Sort0s1s2s().sort(a);
	}

	public void sort(int[] a) {
		int lo = 0;
		int mid = 0;
		int hi = a.length - 1;
		while(mid <= hi){
			switch(a[mid]){
			case 0:
				int temp = a[mid];
				a[mid] = a[lo];
				a[lo] = temp;
				mid++;
				lo++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int temp1 = a[hi];
				a[hi] = a[mid];
				a[mid] = temp1;
				hi--;
				break;
			}
		}
		
		for(int l : a){
			System.out.print(l+",");
		}
	}
}
