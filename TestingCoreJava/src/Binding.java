import java.util.Scanner;

class Vehicle {
	Vehicle() {
		
	}
	void run() {
		System.out.println("Running....vehicle............");
	}
	
	void execute (Vehicle c) {
		System.out.println("Executing....vehicle method............");
	}
	
	void execute (Cycle c) {
		System.out.println("Executing....vehicle method............");
	}
}
class Cycle extends Vehicle {
	Cycle(){
		
	}
	void run() {
		System.out.println("Running....cycle............");
	}
	
	
}
class MTCycle extends Vehicle {
    MTCycle(){
		
	}
	void run() {
		System.out.println("Running....motor cycle............");
	}
}
public class Binding {
public static void main(String args[]) {
	
	Vehicle v1 = new Cycle();
	v1.execute(v1);

	
	Scanner sc=new Scanner(System.in);  
    System.out.println("Enter your choice");  
    String choice = sc.next();
    Vehicle v = null;
    if(choice.equalsIgnoreCase("Cycle")) {
    v = new Cycle();
    }
    else if (choice.equalsIgnoreCase("Motor")) {
    v = new MTCycle();	
    }
	v.run();
	sc.close();
}
}
