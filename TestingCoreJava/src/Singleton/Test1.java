package Singleton;

public class Test1 {
private static Test1 obj;
private Test1() {
	 synchronized(this) {
		obj = new Test1(); 
	 }
 }
}
