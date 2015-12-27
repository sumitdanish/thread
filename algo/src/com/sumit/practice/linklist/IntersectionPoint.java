package com.sumit.practice.linklist;

public class IntersectionPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOperation f = new FileOperation();
		IntersectionPoint in = new IntersectionPoint();
		Node node = null;
		for(String s : f.getFileData("ll.txt")){
			int data = Integer.parseInt(s);
			node = in.createList(node, data);
		}
		//in.print(node);
		System.out.println();
		Node node1 = in.interSection(node);
		//in.print(node1);
		System.out.println(in.getIntersection(node, node1).getData());
		
	}

	
	public Node getIntersection(Node node,Node node1){
		Node head = null;
		Node head1 = null;
		Node head2 = null;
		int len1=getLength(node1);
		int len2=getLength(node);
		int dif = 0;
		if(len2>len1){
			head = node;
			head1 = node1;
			dif = len2 - len1;
		}else{
			head = node1;
			head1 = node;
			dif = len1 - len2;
		}
		int i = 0;
		while(head !=null && i<dif){
			head = head.getNext();
			i++;
		}
		while(head != null && head1 != null){
			if(head.getData() == head1.getData()){
				head2 = head;
				break;
			}
			head = head.getNext();
			head1 = head1.getNext();
		}
		return head2;
		
	}
	
	
	public Node createList(Node node,int data){
		Node n1 = new Node(data);
		if(node  == null){
			node = n1;
		}else{
			node.setNext(createList(node.getNext(), data));
		}
		return node;
	}
	
	public Node interSection(Node n){
		int i = 0;
		Node node = new Node(11);
		while(i<3){
			n = n.getNext();
			i++;
		}
		node.setNext(n);
		return node;
	}
	
	public void print(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.getData()+"->");
		print(node.getNext());
	}
	
	public int getLength(Node node){
		if(node == null){
			return 0;
		}
		return 1+getLength(node.getNext());
	}
	
}
