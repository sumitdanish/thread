package com.sumit.practice.mattrix;

public class IntersectionOfTwoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v = "abxyz";
		String h = "xmlkopxyz";
		int x = 0;
		int y = 0;
		char[][] m = new char[v.length()][h.length()];
		boolean flag = false;
		for(int i = 0;i<v.length();i++){
			for(int j = 0;j<h.length();j++){
				if(h.charAt(j) == v.charAt(i)){
					x = i;
					y = j;
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}
		}
		for(int i = 0;i<v.length();i++){
			for(int j = 0;j<h.length();j++){
				if(i == x){
					m[x][j] = h.charAt(j);
				}else if(j == y){
					m[i][y] = v.charAt(i);
				}else{
					m[i][j] = '#';
				}
			}
		}
		for(int i = 0;i<v.length();i++){
			for(int j = 0;j<h.length();j++){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		System.out.println(x+" : "+y);
	}

}
