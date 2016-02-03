package com.sumit.practice.string;

public class MinWIndowChar {
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(new MinWIndowChar().minWindow(s, t));
	}

	public int minWindow(String s, String t) {
		int minWIndow = 100;
		int[] needToFind = new int[256];
		int[] hasToFind = new int[256];
		int x = 0;
		int y = 0;
		int count = 0;
		for (int i = 0; i < t.length(); i++) {
			needToFind[t.charAt(i)]++;
		}
		int begin = 0;
		for (int i = 0; i < s.length(); i++) {
			hasToFind[s.charAt(i)]++;
			if (hasToFind[s.charAt(i)] <= needToFind[s.charAt(i)]) {
				count++;
			}
			// System.out.println(count);
			if (count == t.length()) {
				while (needToFind[s.charAt(begin)] == 0
						|| hasToFind[s.charAt(begin)] > needToFind[s
								.charAt(begin)]) {
					if (hasToFind[s.charAt(begin)] > needToFind[s.charAt(begin)]) {
						hasToFind[s.charAt(begin)]--;
					}
					begin++;
				}
				int len = i - begin + 1;
				if (len < minWIndow) {
					minWIndow = len;
					x = begin;
					y = i;
				}
			}
		}
		System.out.println(s.substring(x,y+1));
		return minWIndow;
	}
}
