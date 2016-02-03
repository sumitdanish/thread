package com.sumit.practice.string;

public class Interleaved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "AB";
		String str2 = "CD";
		String str3 = "CDEB";
		int m = str1.length();
		int n = str2.length();
		int i = str3.length();
		//new Interleaved().interleaved(str1, str2, new char[m + n + 1], m, n, i);
		//System.out.println(new Interleaved().isInterleaved(str1.toCharArray(), str2.toCharArray(), str3.toCharArray()));
		//System.out.println(new Interleaved().isInterleaved1(str1, str2, str3));
	}

	public void interleaved(String str1, String str2, char[] str3, int m,
			int n, int i) {
		if (m == 0 && n == 0) {
			for (int j = 0; j < i; j++) {
				System.out.print(str3[j]);
			}
			// str3 = null;
			System.out.println();
		}
		if (m != 0 && str1 != null) {
			str3[i] = str1.charAt(0);
			interleaved(str1.substring(1), str2, str3, m - 1, n, i + 1);
		}
		if (n != 0 && str2 != null) {
			str3[i] = str2.charAt(0);
			interleaved(str1, str2.substring(1), str3, m, n - 1, i + 1);
		}
	}

	
	/*public boolean isInterleaved1(String str1,String str2,String str3){
		if(str1 == null || str2 == null || str3 == null){
			return true;
		}
		if(str3 == null){
			return false;
		}
		return (( str3 != null && str1 != null && str3.charAt(0) == str1.charAt(0) && isInterleaved1(str1.substring(1), str2, str3.substring(1)))
				|| (str3 != null && str2 != null && str3.charAt(0) == str2.charAt(0) && isInterleaved1(str1, str2.substring(1), str3.substring(1))));
	}*/
	
	
	public boolean isInterleaved(char[] str1,char[] str2,char[] str3){
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<str1.length){
			if(j<str2.length && str3[i] == str2[j]){
				j++;
			}else if(k<str2.length && str3[i] == str1[k]){
				k++;
			}else{
				return false;
			}
			i++;
		}
		return true;
	}

}
