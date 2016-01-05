package com.sumit.practice.DP;	

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = "BBABCBCAB".toCharArray();
		System.out.println(new LongestPalindrome().getLongestPalin(ch, 0, ch.length-1));
	}

	public int getLongestPalin(char[] ch,int i,int j){
		if(i == j){
			return 1;
		}
		if(i+1 == j && ch[i] == ch[j]){
			return 2;
		}
		if(ch[i] == ch[j]){
			return (2+getLongestPalin(ch, i+1, j-1));
		}
		return getMax(getLongestPalin(ch, i+1, j),getLongestPalin(ch, i, j-1));
	}
	
	public int getMax(int a,int b){
		return a >b ? a : b;
	}
	
	
}
