package com.mypractice.cyclicbarrier;

public class CyclicBarrier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.concurrent.CyclicBarrier cb = new java.util.concurrent.CyclicBarrier(3,new Runnable() {
			
			@Override
			public void run() {
				try{
					System.out.println("All Thread arrive at barrier");
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
			}
		});
		Thread t1 = new Thread(new Task(cb, "T1"));
		Thread t2 = new Thread(new Task(cb, "T2"));
		Thread t3 = new Thread(new Task(cb, "T3"));
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}


class Task implements Runnable{

	java.util.concurrent.CyclicBarrier cb = new java.util.concurrent.CyclicBarrier(3);
	private String serviceName;
	
	public Task(java.util.concurrent.CyclicBarrier cb,String serviceName){
		this.cb = cb;
		this.serviceName = serviceName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println("Service : "+serviceName+" Arrive at barrier");
			cb.await();
			System.out.println("Service : "+serviceName+" Croos the barrier");
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}