package com.threadpoll.producerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerUsingBQ {
	public static void main(String[] args) {
		int size = 7;
		BlockingQueue<Integer> bq = new LinkedBlockingDeque<Integer>();
		Thread prod = new Thread(new Producer1(bq, size), "Produer");
		Thread cons = new Thread(new Consumer1(bq, size), "Consumer");
		prod.start();
		cons.start();
	}
}

class Producer1 implements Runnable {
	BlockingQueue<Integer> bq = new LinkedBlockingDeque<Integer>();
	int size = 0;

	public Producer1(BlockingQueue<Integer> bq, int size) {
		this.size = size;
		this.bq = bq;
	}

	public void produce(int i) {
		try {
			System.out.println("Producing : " + i);
			bq.put(i);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			try {
				produce(i);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

class Consumer1 implements Runnable {

	BlockingQueue<Integer> bq = new LinkedBlockingDeque<Integer>();
	int size = 0;

	public Consumer1(BlockingQueue<Integer> bq, int size) {
		this.bq = bq;
		this.size = size;
	}

	public void consume() {
		try {
			System.out.println("Consuming : " + bq.take());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				consume();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}