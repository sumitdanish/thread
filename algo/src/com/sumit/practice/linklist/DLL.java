package com.sumit.practice.linklist;

public class DLL {

	
	private int data;
	private DLL next;
	private DLL pre;
	
	public DLL(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLL getNext() {
		return next;
	}

	public void setNext(DLL next) {
		this.next = next;
	}

	public DLL getPre() {
		return pre;
	}

	public void setPre(DLL pre) {
		this.pre = pre;
	}
	
	
	
}
