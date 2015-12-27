package com.sumit.practice.linklist;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperation f = new FileOperation();
		Node node = null;
		RemoveDuplicate re = new RemoveDuplicate();
		for(String s: f.getFileData("dup.txt")){
			int data = Integer.parseInt(s);
			node = re.crateList(node, data);
		}
		re.print(node);
		System.out.println();
		re.removeDuplicate(node);
	}

	
	
	
	public void removeDuplicate(Node node){
		Node n2 = node;
		
		while(n2 != null){
			if(n2.getNext() != null && n2.getData() == n2.getNext().getData()){
				n2.setNext(n2.getNext().getNext());
			}else{
				n2 = n2.getNext();
			}
		}
		print(node);
	}
	
	
	public Node crateList(Node node,int data){
		Node n = new Node(data);
		if(node == null){
			node = n;
		}else{
			node.setNext(crateList(node.getNext(), data));
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
