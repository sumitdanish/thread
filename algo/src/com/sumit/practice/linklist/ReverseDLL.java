package com.sumit.practice.linklist;

public class ReverseDLL {

	static DLL head;
	static DLL pre;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOperation f = new FileOperation();
		head = null;
		pre = null;
		ReverseDLL re = new ReverseDLL();
		for(String s: f.getFileData("dll.txt")){
			int data = Integer.parseInt(s);
			re.createDLL(data);
		}
		
	re.printNext(head);
	System.out.println();
	re.reverse();
	System.out.println();
	
	}

	
	public void reverse(){
		DLL n1 = head;
		pre = head;
		DLL n2 = null;
		while(n1 != null){
			n2 = n1.getPre();
			n1.setPre(n1.getNext());
			n1.setNext(n2);
			n1 = n1.getPre();
		}
		head = n2.getPre();
		printNext(head);
	}
	
	
	
	public void createDLL(int data){
		DLL d = new DLL(data);
		if(head == null){
			head = d;
			pre = d;
		}else{
			DLL d1 = head;
			while(d1.getNext() != null){
				d1 = d1.getNext();
			}
			d1.setNext(d);
			d.setPre(d1);
			pre = d;
		}
	}
	
	public void printNext(DLL next){
		if(next == null){
			return;
		}
		System.out.print(next.getData()+"-->");
		printNext(next.getNext());
	}
	
	public void printPre(DLL pre){
		if(pre == null){
			return;
		}
		System.out.print(pre.getData()+"->");
		printPre(pre.getPre());
		
	}
	
}
