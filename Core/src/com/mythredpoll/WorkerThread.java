package com.mythredpoll;

public class WorkerThread implements Runnable{

	
	MyQueue<Runnable> queue;
	String name;
	public WorkerThread(MyQueue<Runnable> queue,String name) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Runnable r = queue.deQueue();
				System.out.println("Item taken by thread : "+name);
				r.run();
				System.out.println("Item completed by : "+name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
	
}
