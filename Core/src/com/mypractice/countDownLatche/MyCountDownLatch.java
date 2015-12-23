package com.mypractice.countDownLatche;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch cl = new CountDownLatch(3);
		Thread t1 = new Thread(new Task(cl, "T1"));
		Thread t2 = new Thread(new Task(cl, "T2"));
		Thread t3 = new Thread(new Task(cl, "T3"));
		t1.start();
		t2.start();
		t3.start();
		try{
			System.out.println("All Thread is started up and running.......");
			cl.await();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}

class Task implements Runnable{

	private CountDownLatch cl;
	private String serviceName;
	public Task(CountDownLatch cl,String serviceName){
		this.cl = cl;
		this.serviceName = serviceName;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(3000);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("Service started "+serviceName);
		cl.countDown();
	}
	
}