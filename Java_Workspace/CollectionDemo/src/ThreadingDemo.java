	
public class ThreadingDemo {

	//By extending Thread class
	//By implementing Runnable interface
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThreadClassDemo thread1 = new ThreadClassDemo();
//		thread1.start();
//		
		RunnableInterfaceDemo thread2= new RunnableInterfaceDemo();
		Thread thread = new Thread(thread2);
		thread.start();
	}

}
