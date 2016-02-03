package com.sumit.practice.linklist;

public class MergeTwoLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperation f1 = new FileOperation();
		FileOperation f2 = new FileOperation();
		Node n1 = null;
		Node n2 = null;
		MergeTwoLinkList m = new MergeTwoLinkList();
		for(String s : f1.getFileData("ll.txt")){
			int data = Integer.parseInt(s);
			n1 = m.createLinkList(n1, data);
		}
		for(String s : f2.getFileData("ll1.txt")){
			int data = Integer.parseInt(s);
			n2 = m.createLinkList(n2, data);
		}
		
		Node result = m.merge(n1, n2);
		m.print(result);
		System.out.println();
		
	}
	
	
	public Node merge(Node head1,Node head2){
		Node result = null;
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		if(head1.getData() < head2.getData()){
			result = head1;
			result.setNext(merge(head1.getNext(),head2));
		}else{
			result = head2;
			result.setNext(merge(head1, head2.getNext()));
		}
		return result;
	}
	
	
	
	public Node createLinkList(Node node,int data){
		Node n = new Node(data);
		if(node == null){
			node = n;
		}else{
			node.setNext(createLinkList(node.getNext(), data));
		}
		return node;
	}
	
	public void print(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.getData()+" > ");
		print(node.getNext());
	}
}
