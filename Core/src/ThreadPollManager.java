
public class ThreadPollManager {
	MyQueue<Runnable> queue = new MyQueue<Runnable>();
	int capacity;
	public ThreadPollManager(int capacity) {
		this.capacity = capacity;
		init();
		
	}
	
	public void init(){
		for(int i = 0;i<capacity;i++){
			Thread t = new Thread (new WorkerThread(queue,String.valueOf(i)));
			t.start();
		}
	}
	
	public void submitTask(Runnable r) throws InterruptedException{
		queue.enqueue(r);
	}
}
