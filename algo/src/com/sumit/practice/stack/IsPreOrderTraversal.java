package com.sumit.practice.stack;

import java.util.Stack;

public class IsPreOrderTraversal {
	public static void main(String[] args) {
		int[] pre = { 2, 4, 3 };
		boolean b = new IsPreOrderTraversal().isPreorder(pre);
		System.out.println(b);
	}

	public boolean isPreorder(int[] pre) {
		Stack<Integer> st = new Stack<Integer>();
		int root = Integer.MIN_VALUE;
		for (int i = 0; i < pre.length; i++) {
			if (root > pre[i]) {
				return false;
			}
			if (!st.isEmpty()) {
				int x = st.peek();
				while (!st.isEmpty() && x < pre[i]) {
					root = st.pop();
				}
			}
			st.push(pre[i]);
		}
		return true;
	}
}
