package com.sumit.practice.tree;

import java.util.Arrays;

public class PrintPostOrderFromInOrderAndPreOrder {
	public static void main(String[] args) {
		int[] in = {4, 2, 5, 1, 3, 6};
		int[] prer = {1, 2, 4, 5, 3, 6};
		new PrintPostOrderFromInOrderAndPreOrder().printPost(in, prer,0,in.length);
	}
	
	public void printPost(int[] in,int[] pre,int start,int end){
		int r = 0;
		if(pre.length > 0){
			r = search(in, pre[0],end);
		}
		if(r != 0 && r != -1){
			printPost(in,Arrays.copyOfRange(pre,1,pre.length), start,r);
		}
		if(r != end-1){
			printPost(Arrays.copyOfRange(in,r+1, in.length), Arrays.copyOfRange(pre,r+1,pre.length),r+1, end-r-1);
		}
		System.out.print(pre[0]+",");
	}
	
	public int search(int[] in,int x,int n){
		for(int i = 0;i<n;i++){
			if(in[i] == x){
				return i;
			}
		}
		return -1;
	}
}
