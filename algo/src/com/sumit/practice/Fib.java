package com.sumit.practice;

public class Fib {

	int[] l = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int fib(int n){
		if(n <= 1){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public int fib1(int n){
		if(l[n] == 0){
			if(n <= 1){
				l[n] = n;
			}else{
				l[n] = fib1(n-1)+fib(n-2);
			}
		}
		return l[n];
	}
	
	public void fib2(int n){
		int[] f = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for(int i = 2;i<n;i++){
			f[i] = f[i-1]+f[i-2];
		}
		System.out.println(f[n]);
	}
}
