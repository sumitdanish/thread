package com.sumit.practice.DP;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "geek";
		String s2 = "gesek";
		//System.out.println(new EditDistance().editDistance(s1.toCharArray(), s2.toCharArray(),s1.length(),s2.length()));
		new EditDistance().editDiatance(s1, s2);
	}

	
	public int editDistance(char[] ch1,char[] ch2,int s1,int s2){
		if(s1 == 0){
			return s2;
		}
		if(s2 == 0){
			return s1;
		}
		if(ch1[s1-1] == ch2[s2-1]){
			return editDistance(ch1, ch2, s1-1, s2-1);
		}
		return 1+getMin1(
							editDistance(ch1, ch2, s1, s2-1),
							editDistance(ch1, ch2, s1-1, s2),
							editDistance(ch1, ch2, s1-1, s2-1)
						);
	}
	
	
	public void editDiatance(String s1,String s2){
		int[][] dis = new int[s1.length()+1][s2.length()+1];
		for(int i = 0;i<=s1.length();i++){
			for(int j = 0;j<=s2.length();j++){
				if(i == 0){
					dis[i][j] = j;
				}
				else if(j == 0){
					dis[i][j] = i;
				}else if(s1.charAt(i-1) == s2.charAt(j-1)){
					dis[i][j] = dis[i-1][j-1];
				}else{
					dis[i][j] = 1 + getMin1(dis[i][j-1], dis[i-1][j],dis[i-1][j-1]);
				}
			}
		}
		System.out.println(dis[s1.length()][s2.length()]);
	}
	
	
	public int getMin1(int a,int b,int c){
		return getMin(a, b)>c?c:getMin(a, b);
	}
	
	
	public int getMin(int a,int b){
		return a<b?a:b;
	}
	
	
}
