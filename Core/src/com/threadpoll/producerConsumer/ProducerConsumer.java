package com.threadpoll.producerConsumer;

import java.util.Vector;

public class ProducerConsumer {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int size = 7;
		Thread prod = new Thread(new Producer(v, size),"Producer");
		Thread cons = new Thread(new Consumer(v, size),"Consumer");
		prod.start();
		cons.start();
	}
}

class Producer implements Runnable {

	Vector<Integer> v = new Vector<Integer>();
	int size = 0;
	public Producer(Vector<Integer> v,int size){
		this.size = size;
		this.v = v;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<size;i++){
			try{
				produces(i);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

	}
	
	public void produces(int i){
		while(v.size() == size){
			synchronized (v) {
				System.out.println("List is full : No production");
				try{
					v.wait();
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		}
		synchronized (v) {
			System.out.println("Producting : "+i);
			v.add(i);
			v.notifyAll();
		}
	}

}

class Consumer implements Runnable {

	Vector<Integer> v = new Vector<Integer>();
	int size = 0;

	public Consumer(Vector<Integer> v, int size) {
		this.v = v;
		this.size = size;
	}

	@Override
	public void run() {
		while(true){
			try{
				System.out.println("Consuming : "+consume());
				Thread.sleep(5000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

	}

	public int consume() {
		while (v.isEmpty()) {
			try {
				synchronized (v) {
					System.out.println("Thread is empty : "
							+ Thread.currentThread().getName());
					v.wait();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		synchronized (v) {
			v.notifyAll();
			return v.remove(0);
		}
	}

}