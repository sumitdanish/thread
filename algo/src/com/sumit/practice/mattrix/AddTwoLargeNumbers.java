package com.sumit.practice.mattrix;

public class AddTwoLargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "111111113564661739487534985938475983745993485798345937645876846583646523645827346827634826836642372";
		String s2 = "9943123456923423419078788987987108475934587684658273498723946898235698364956394856984598495789863457679345693465983645";
		System.out.println();
		char[] ch = new AddTwoLargeNumbers().sum(s1, s2).toCharArray();
		for(int i = ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
	
	public String sum(String s1,String s2){
		int carry = 0;
		int result = 0;
		if(s2.length() > s1.length()){
			String temp = s2;
			s2 = s1;
			s1 = temp;
		}
		int j = s2.length()-1;
		StringBuilder sb = new StringBuilder();
		int i = s1.length()-1;
		for(;i>=0;i--){
			int val1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
			if(j>=0){
				int val2 = Integer.parseInt(String.valueOf(s2.charAt(j)));
				result = val1+val2+carry; 
			}else{
				result = val1+carry;
			}
			carry = result / 10;
			int val = result % 10;
			sb = sb.append(String.valueOf(val));
			if(i == 0 && carry != 0){
				sb = sb.append(String.valueOf(carry));
			}
			j--;
		}
		
		return sb.toString();
	}

}
