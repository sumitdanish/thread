package com.sumit.practice.linklist;

public class CloneSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperation f = new FileOperation();
		Node node = null;
		CloneSinglyLinkedList cl = new CloneSinglyLinkedList();
		for(String s : f.getFileData("ll.txt")){
			int data = Integer.parseInt(s);
			node = cl.createList(node, data);
		}
		
		cl.print(node);
		System.out.println();
		cl.insert(node);
		
	}
	
	public void insert(Node node){
		Node cl1 = node;
		while(cl1 != null){
			Node cl = new Node(cl1.getData());
			Node orginal = cl1.getNext();
			cl1.setNext(cl);
			cl.setNext(orginal);
			cl1 = cl1.getNext();
			if(cl1 != null){
				cl1 = cl1.getNext();
			}
		}
		print(node);
	}
	
	public Node createList(Node node,int data){
		Node n = new Node(data);
		if(node == null){
			node = n;
		}else{
			node.setNext(createList(node.getNext(), data));
		}
		return node;
	}
	public void print(Node n){
		if(n == null){
			return;
		}
		System.out.print(n.getData()+"-->");
		print(n.getNext());
	}
}
