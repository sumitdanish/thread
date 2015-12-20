package com.sumit.practice.linklist;

import java.io.File;

public class CreateLinkedList {

	static Node sll;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Node n = null;;
			FileOperation f = new FileOperation();
			CreateLinkedList cl = new CreateLinkedList();
			for(String s : f.getFileData("ll.txt")){
				n = cl.createLinkedList(n, Integer.parseInt(s));
				//cl.createLL(Integer.parseInt(s));
			}
			//cl.insertIntoHead(12);
			//cl.insetIntoMid(32,3);
			cl.print1(n);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void insertIntoHead(int data){
		Node n = new Node(data);
		if(sll == null){
			sll = n;
		}else{
			n.setNext(sll);
			sll = n;
		}
		
	}
	
	public void insetIntoMid(int data,int data1){
		Node n = sll;
		while(n != null){
			if(n.getData() == data1){
				Node n1 = n.getNext();
				n.setNext(new Node(data));
				n.getNext().setNext(n1);
			}
			n = n.getNext();
		}
	}

	public Node createLinkedList(Node node,int data){
		Node n = new Node(data);
		if(node == null){
			node = n;
		}else{
			node.setNext(createLinkedList(node.getNext(), data));
		}
		return node;
	}
	public void createLL(int data){
		Node n = new Node(data);
		if(sll == null){
			sll = n;
		}else{
			Node n1 = sll;
			while(n1.getNext() != null){
				n1 = n1.getNext();
			}
			n1.setNext(n);
			//sll = n1;
		}
	}
	
	public void print1(Node n){
		if(n == null){
			return;
		}
		System.out.print(n.getData()+"-->");
		print1(n.getNext());
	}
	
	public void print(Node n){
		while(n != null){
			System.out.print(n.getData()+"--->");
			n = n.getNext();
		}
	}
}
