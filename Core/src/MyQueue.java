import java.util.LinkedList;
import java.util.Queue;


public class MyQueue<E> implements CustomQueue<E>{

	
	Queue<E> queue = new LinkedList<E>();
	@Override
	public synchronized void enqueue(E i) throws InterruptedException {
		// TODO Auto-generated method stub
		queue.add(i);
		notifyAll();
		
	}

	@Override
	public synchronized E deQueue() throws InterruptedException {
		// TODO Auto-generated method stub
		while(queue.isEmpty()){
			wait();
		}
		
		return queue.remove();
	}

}
