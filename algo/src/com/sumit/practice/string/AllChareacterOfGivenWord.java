package com.sumit.practice.string;

public class AllChareacterOfGivenWord {
	public static void main(String[] args) {
		String s = "sun";
		String[] str = {"sunday","geeksforgeeks","utensils","just","assss"};
		new AllChareacterOfGivenWord().printAll(str, s);
	}

	public void printAll(String[] str, String s) {
		int[] needToCheck = new int[256];
		for (int i = 0; i < s.length(); i++) {
			needToCheck[s.charAt(i)]++;
		}
		for (int i = 0; i < str.length; i++) {
			int[] hasToFind = new int[256];
			int count = 0;
			for (int j = 0; j < str[i].length(); j++) {
				hasToFind[str[i].charAt(j)]++;
			}
			for (int k = 0; k < s.length(); k++) {
				if (needToCheck[s.charAt(k)] != 0
						&& hasToFind[s.charAt(k)] != 0
						&& needToCheck[s.charAt(k)] == hasToFind[s.charAt(k)]) {
					count++;
				}
			}
			if(count == s.length()){
				System.out.println(str[i].toString());
			}

		}
	}
}
