package com.sumit.practice.linklist;

public class DLLOperation {

	static DLL head;
	static DLL pre;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLLOperation dll = new DLLOperation();
		head = null;
		pre = null;
		FileOperation f = new FileOperation();
		for(String s : f.getFileData("dll.txt")){
			Integer data = Integer.parseInt(s);
			dll.createDLL(data);
		}
		//dll.insertIntoHead(12);
		//dll.insertIntoMid(23,5);
		dll.printNext(head);
		System.out.println();
		dll.printPrev(pre);
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
	
	public void insertIntoHead(int data){
		DLL d = new DLL(data);
		if(head == null){
			head = d;
			pre = d;
		}else{
			d.setNext(head);
			head.setPre(d);
			head = d;
			d.setPre(null);
		}
	}
	
	public void insertIntoMid(int data,int data1){
		DLL d = new DLL(data);
		DLL d1 = head;
		while(d1 != null){
			if(d1.getData() == data1){
				DLL d2 = d1.getNext();
				DLL d3 = d1.getNext().getPre();
				d1.setNext(d);
				d.setNext(d2);
				d2.setPre(d);
				d.setPre(d3);
				break;
			}else{
				d1 = d1.getNext();
			}
		}
	}
	
	public void printNext(DLL next){
		if(next == null){
			return;
		}
		System.out.print(next.getData()+"-->");
		printNext(next.getNext());
	}
	
	public void printPrev(DLL pre){
		if(pre == null){
			return;
		}
		System.out.print(pre.getData()+"-->");
		printPrev(pre.getPre());
	}
	
}
