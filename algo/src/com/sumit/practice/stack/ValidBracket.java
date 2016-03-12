package com.sumit.practice.stack;

import java.util.Stack;

public class ValidBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidBracket().valid("()(()))))");;
	}
	public void valid(String str){
		Stack<Character> st = new Stack<Character>();
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == '('){
				st.push(str.charAt(i));
			}else{
				if(!st.isEmpty() && str.charAt(i) == ')'){
					//System.out.println(i);
					st.pop();
					count +=2;
				}
			}
		}
		System.out.println(count);
	}
}
