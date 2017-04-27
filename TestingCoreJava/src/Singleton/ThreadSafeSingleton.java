package Singleton;

public class ThreadSafeSingleton {

	private ThreadSafeSingleton(){
		
	}
	
	private static ThreadSafeSingleton instance;
	
	public static ThreadSafeSingleton getInstance() {
		if(instance == null ) {
		synchronized(ThreadSafeSingleton.class) {
			instance  = new ThreadSafeSingleton();
			return instance;
		}
		}
		return instance;
		
	}
	
}
