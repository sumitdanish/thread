package com.sumit.practice.linklist;

public class Node {

	private int data;
	private Node next;
	private Node random;
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getRandom() {
		return random;
	}
	public void setRandom(Node random) {
		this.random = random;
	}
	
	
	
}
