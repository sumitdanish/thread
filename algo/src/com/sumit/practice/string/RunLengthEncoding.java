package com.sumit.practice.string;

public class RunLengthEncoding {
	public static void main(String[] args) {
		String s = "wwwwaaadexxxxxx";
		System.out.println(new RunLengthEncoding().rel(s));
	}
	public String rel(String s){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<s.length();i++){
			int x = i;
			int j = i;
			int count = 0;
			while(j < s.length() && s.charAt(i) == s.charAt(j)){
				count++;
				j++;
			}
			i = j-1;
			sb.append(String.valueOf(s.charAt(x))).append(String.valueOf(count));
		}
		return sb.toString();
	}
}
