import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Work implements Runnable {
	public void run() {
		System.out.println("Running....Hello World..........."+Thread.currentThread().getName());
	}
}
public class TestThPool {
	public static void main(String[] args) {  
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new Work();  
            executor.execute(worker);//calling execute method of ExecutorService  
          }  
    }
}
