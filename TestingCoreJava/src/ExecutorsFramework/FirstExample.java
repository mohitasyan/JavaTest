package ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskPrint implements Runnable { 
	private final String name; 
	public TaskPrint(String name) { 
		this.name = name; 
		} 
	public void run() { 
		System.out.println("Starting: " + name); 
		try { 
			Thread.sleep(10000);
			} catch (InterruptedException ignored) { } 
		System.out.println("Done with: " + name); } 
} 
public class FirstExample {
	public static void main(String args[]) {
		ExecutorService executor =  Executors.newFixedThreadPool(3);
	    for (int i=0; i<10; i++) {
			 Runnable object = new TaskPrint("abc"+"  "+i);
			 executor.execute(object);
		 }
	    executor.shutdown();
	}
}
