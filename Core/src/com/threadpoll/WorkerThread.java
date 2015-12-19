package com.threadpoll;

public class WorkerThread implements Runnable{

	String threadName;
	public WorkerThread(String threadName){
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Getting Task ...."+Thread.currentThread().getName());
		try{
			Thread.sleep(3000);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("Task Is Finish : "+Thread.currentThread().getName());
	}

	@Override
	public String toString(){
		return threadName.toString();
	}
	
}
