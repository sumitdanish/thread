package com.sumit.practice.DP;

public class MinCoinProblem {

	public static void main(String[] args){
		int[] a = {1,2,3};
		int val = 4;
		int v = new MinCoinProblem().countCoins(a,a.length, val);
		System.out.println(v);
	} 
		
	public int countCoins(int[] coinArray,int cm,int coinVal){
		if(coinVal == 0){
			return 1;
		}
		if(coinVal < 0){
			return 0;
		}
		if(cm <=0 && coinVal>=1){
			return 0;
		}
		return countCoins(coinArray, cm-1, coinVal)+countCoins(coinArray, cm, coinVal-coinArray[cm-1]);
	}
}
