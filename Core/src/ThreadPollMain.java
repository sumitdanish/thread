


public class ThreadPollMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			ThreadPollManager t = new ThreadPollManager(5);
			t.submitTask(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("Submitting Task By A...");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Completing Task By A");
				}
			});
			t.submitTask(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Submitting tak By B....");
					try{
						Thread.sleep(3000);
					}catch(Exception ex){
						ex.printStackTrace();
					}
					System.out.println("Completing task by B");
				}
			});
		}catch(Exception ex){
			
		}
	}

}
