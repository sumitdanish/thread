package com.mythredpoll;

public interface CustomQueue<E> {

	public void enqueue(E i) throws Exception;
	public E deQueue() throws Exception;
}
