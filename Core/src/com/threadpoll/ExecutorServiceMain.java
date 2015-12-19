package com.threadpoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

	public static void main(String[] args) {
		try{
			ExecutorService e = Executors.newFixedThreadPool(5);
			for(int i = 0;i<10;i++){
				e.execute(new WorkerThread(String.valueOf(i)));
			}
			e.shutdown();
			System.out.println("Executor Service Has Finish its task");
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
