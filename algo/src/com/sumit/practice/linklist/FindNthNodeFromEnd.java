package com.sumit.practice.linklist;

public class FindNthNodeFromEnd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FindNthNodeFromEnd fn = new FindNthNodeFromEnd();
			FileOperation f = new FileOperation();
			Node n = null;
			for(String s : f.getFileData("ll.txt")){
				n = fn.createList(n, Integer.parseInt(s));
			}
			fn.print(n);
			System.out.println("--------------");
			System.out.println(fn.getNthNode(n,3).getData());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public Node getNthNode(Node n,int num){
		Node n1 = n;
		Node n2 = n;
		int i = 0;
		while(i <num && n1 != null){
			n1 = n1.getNext();
			i++;
		}
		
		while(n1 != null){
			n2 = n2.getNext();
			n1 = n1.getNext();
		}
		
		return n2;
	}
	
	
	public Node createList(Node node,int data){
		Node n = new Node(data);
		if(node == null){
			node  = n;
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
