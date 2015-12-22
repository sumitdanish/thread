package com.sumit.practice.linklist;

public class MyStack {
	
	Node n;
	public static void main(String[] args){
		FileOperation f = new FileOperation();
		MyStack m = new MyStack();
		for(String s : f.getFileData("ll.txt")){
			int data = Integer.parseInt(s);
			m.push(data);
		}
		
		System.out.println(m.pop());
		System.out.println(m.pop());
	}
	
	
	public void push(int data){
		Node ns = new Node(data);
		if(n == null){
			n = ns;
		}else{
			ns.setNext(n);
			n = ns;
		}
	}
	
	public int pop(){
		if(n == null){
			return -1;
		}else{
			int data = n.getData();
			Node n1 = n.getNext();
			n = n1;
			return data;
		}
	}
}
