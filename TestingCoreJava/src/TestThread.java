import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AThread implements Runnable {
	Object obj = new Object();
	@Override
	public void run() {
		System.out.println(obj);
		synchronized(obj) {
		for(int i=0;i<4;i++){
			System.out.print(i+"  ");
			System.out.println(Thread.currentThread().getName());
			}
		}
	}
	
}
public class TestThread {
public static void main(String args[]) {
	AThread t1 = new AThread();
	Thread x = new Thread(t1);
	x.setName("Mohita");
	Thread y = new Thread(t1);
	y.setName("Rozer");
	x.start();
	y.start();
	
	ExecutorService  service  =  Executors.newFixedThreadPool(3);
}
}
