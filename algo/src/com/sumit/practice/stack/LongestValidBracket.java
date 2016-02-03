package com.sumit.practice.stack;

public class LongestValidBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LongestValidBracket().longest(")()())");
	}

	public void longest(String s){
		int count = 0;
		int max = -100;
		for(int i = 0;i<s.length();i++){
			count = 1;
			for(int j = i+1;j<s.length();j++){
				if(s.charAt(i) == '(' && s.charAt(j)==')'){
					count++;
				}
			}
			if(count > max){
				max = count;
			}
		}
		System.out.println(max);
	}
	
	
}
