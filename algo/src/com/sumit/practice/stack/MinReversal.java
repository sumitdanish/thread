package com.sumit.practice.stack;

public class MinReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MinReversal().minReversal("}{");
	}

	public void minReversal(String s){
		int open = 0;
		int toReverse = 0;
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i) == '{'){
				open++;
			}else{
				if(open > 0){
					open--;
				}else{
					toReverse++;
					open++;
				}
			}
		}
		System.out.println(toReverse+" : "+open);
		toReverse+=open/2;
		System.out.println(toReverse);
	}
	
	
}
