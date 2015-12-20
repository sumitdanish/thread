package com.sumit.practice.linklist;

public class DeleteCompleteLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperation f = new FileOperation();
		DeleteCompleteLinkList d = new DeleteCompleteLinkList();
		Node n = null;
		for(String s : f.getFileData("ll.txt")){
			n = d.createList(n,Integer.parseInt(s));
		}
		d.print(n);
		System.out.println();
		if(d.deleteList(n) == null){
			System.out.println("List is deleted completely");
		}
	}

	public Node createList(Node node,int data){
		Node n = new Node(data);
		if(node == null){
			node = n;
		}
		else{
			node.setNext(createList(node.getNext(), data));
		}
		return node;
	}
	
	public Node deleteList(Node n){
		if(n == null){
			return null;
		}else{
			Node n1 = n.getNext();
			n = null;
			return deleteList(n1);
		}
	}
	
	public void print(Node n){
		if(n == null){
			return;
		}
		System.out.print(n.getData()+" -- >");
		print(n.getNext());
	}
}
