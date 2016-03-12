package com.sumit.practice.string;

public class RankOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rank : "+new RankOfString().findRank("BCA"));
	}

	public int findRank(String str){
		int fac = fact(str.length());
		int rank = 0;
		int len = str.length();
		for(int i = 0 ; i < len ; i++){
			fac /= (len - i);
			int smallest = countSmallest(i, len, str);
			rank += fac * smallest;
		}
		return rank + 1;
	}
	
	
	public int countSmallest(int low,int n,String str){
		int count = 0;
		for(int i = low+1 ; i < n ; i++){
			if(str.charAt(low) > str.charAt(i)){
				count++;
			}
		}
		return count;
	}
	
	
	
	public int fact(int n){
		return (n == 0 || n == 1 ? 1 : n*fact(n-1));
	}
	
}

class ABC{
	int h = 0;
	String u = "";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + h;
		result = prime * result + ((u == null) ? 0 : u.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ABC other = (ABC) obj;
		if (h != other.h)
			return false;
		if (u == null) {
			if (other.u != null)
				return false;
		} else if (!u.equals(other.u))
			return false;
		return true;
	}
	
	
	
}
