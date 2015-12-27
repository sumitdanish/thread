package com.sumit.practice.linklist;

public class InsertIntoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOperation f = new FileOperation();
		Node node = null;
		int v = 9;
		InsertIntoSortedList in = new InsertIntoSortedList();
		for(String s : f.getFileData("ll.txt")){
			node = in.createList(node, Integer.parseInt(s));
		}
		in.print(node);
		System.out.println();
		in.intsert(node, v);
	}

	public void intsert(Node node,int val){
		Node n = new Node(val);
		Node n1 = node;
		if(n1 == null){
			node = n;
		}else{
			while(n1 != null){
				if(n1.getData() < val){
					if(n1.getNext() != null){
						Node n2 = n1.getNext();
						if(n2.getData() > val){
							n1.setNext(n);
							n.setNext(n2);
						}
					}else{
						n1.setNext(n);
					}
				}
				n1 = n1.getNext();
			}
		}
		print(node);
	}
	
	
	
	public Node createList(Node node,int data){
		Node n1 = new Node(data);
		if(node == null){
			node = n1;
		}else{
			node.setNext(createList(node.getNext(), data));
		}
		return node;
	}
	
	public void print(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.getData()+"->");
		print(node.getNext());
	}
	
}
