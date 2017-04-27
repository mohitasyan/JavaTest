package OddEvenThread;
class OdEv {
	static	int i = 1  ;
	
		
	
		public void printOdd() {
			synchronized(this) {
					if(i%2!=0) {
						System.out.println("Printing odd number....."+i);
						i++;
						this.notify();
					}	
						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
		}
		
		public void printEven() {
			synchronized(this) {
					if(i%2==0) {
						System.out.println("Printing even number....."+i);
						i++;
						this.notify();
					}	
						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			}
		}
	
}
public class ThreadDemo {
	static OdEv obj = new OdEv();
	public static void main(String args[]) {
	  Thread oddThread = new Thread() {
		public void run() {
			for(int i=0;i<10;i++) {
				obj.printOdd();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	  };
		
	  Thread evenThread = new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					obj.printEven();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		  };	
		
		oddThread.start();
		evenThread.start();
		
} 
}
