package com.sumit.practice.linklist;

public class ReverseLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOperation fo = new FileOperation();
		ReverseLinkList r = new ReverseLinkList();
		Node head = null;
		for(String s : fo.getFileData("ll.txt")){
			head = r.createList(head, Integer.parseInt(s));
		}
		r.print(head);
		Node n = r.reverse(head);
		System.out.println();
		r.print(n);
		
	}
	
	
	public Node reverse(Node head){
		Node n = head;
		Node n1 = null;
		Node pre = null;
		while(n != null){
			n1 = n.getNext();
			n.setNext(pre);
			pre = n;
			n = n1;
		}
		head = pre;
		return head;
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
