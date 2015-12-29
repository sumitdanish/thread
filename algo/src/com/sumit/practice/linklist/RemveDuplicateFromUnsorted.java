package com.sumit.practice.linklist;

public class RemveDuplicateFromUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemveDuplicateFromUnsorted re= new RemveDuplicateFromUnsorted();
		FileOperation f = new FileOperation();
		Node node = null;
		for(String s : f.getFileData("unso.txt")){
			Integer data = Integer.parseInt(s);
			node = re.createList(node, data);
		}
		re.print(node);
		System.out.println();
		re.removeDuplicate(node);
	}
	
	public void removeDuplicate(Node node){
		Node p1 = node;
		Node p2 = null;
		while(p1 != null){
			p2 = p1;
			while(p2 != null){
				if(p2.getNext()!= null && p1.getData() == p2.getNext().getData()){
					Node p3 = p2.getNext();
					p2.setNext(p2.getNext().getNext());
					p3 = null;
				}else{
					p2 = p2.getNext();
				}
			}
			p1= p1.getNext();
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
	public void print(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.getData()+"-->");
		print(node.getNext());
	}
}
