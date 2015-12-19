package com.sumit.practice.DP;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		//System.out.println(new LongestCommonSubsequence().lcs(s1, s2));
		new LongestCommonSubsequence().lcs1(s1, s2);
	}
	
	public int lcs(String s1,String s2){
		if(s1 == null || s2 ==null ){
			return 0;
		}
		if((s1.charAt(0) == s2.charAt(0))){
			return 1+lcs(s1.substring(1),s2.substring(1));
		}
		return getMax(lcs(s1.length() >1 ?s1.substring(1):null,s2)
					 ,lcs(s1,s2.length() >1 ?s2.substring(1):null)); 
	}
	
	private int getMax(int a,int b){
		return (a > b ? a : b);
	}
	
	
	public void  lcs1(String s1,String s2){
		int[][] lcs = new int[s1.length()+1][s2.length()+1];
		for(int i = 0;i<=s1.length();i++){
			for(int j = 0;j<=s2.length();j++){
				lcs[i][j] = 1;
			}
		}
		for(int i = 0;i<=s1.length();i++){
			for(int j = 0;j<=s2.length();j++){
				if(i == 0 || j ==0){
					lcs[i][j] = 0;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1)){
					lcs[i][j] = 1 + lcs[i-1][j-1];
				}else{
					lcs[i][j] = getMax(lcs[i-1][j],lcs[i][j-1]);
				}
			}
		}
		for(int i = 0;i<=s1.length();i++){
			for(int j = 0;j<=s2.length();j++){
				System.out.print(lcs[i][j]+",");
			}
			System.out.println();
		}
		System.out.println(lcs[s1.length()][s2.length()]);
	}
}
