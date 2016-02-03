
public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Executinh...");
		NameRunnable n1 = new NameRunnable();
		Thread t1 = new Thread(n1,"freed");
		Thread t2 = new Thread(n1,"freed1");
		Thread t3 = new Thread(n1,"freed2");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}
}
class NameRunnable implements Runnable {
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" ...");
		for(int i = 0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+" >>> "+i);
		}
		try{
			Thread.sleep(500);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
