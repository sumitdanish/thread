package com.sumit.practice.DP;

import java.util.HashMap;

public class ArraySabre {

	public static void main(String[] args){
		int[] _a =  new int[]{1,5,3,4,2};
		int _k = 2;
		int res = new ArraySabre().pairs(_a, _k);
		
		System.out.println(res);
	}
	
	public int pairs(int[] _a,int _k){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
		for(int j = 0;j<_a.length;j++){
			map.put(_a[j], _a[j]);
		}
		for(int i = 0;i<_a.length;i++){
			int sum = _k+_a[i];
			if(!map.containsKey(sum)){
				map.put(sum,sum);
			}else{
				count++;
			}
		}
		return count;
	}
	
}
