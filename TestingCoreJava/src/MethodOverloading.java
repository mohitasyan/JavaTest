class ABC1 {
	public void method(int a,float b){
		System.out.println("In super class..first.........");
	}
	
	public void method(float c,int d) {
		System.out.println("In super class...........");
	}
}

class C1 extends ABC1 {
	public void method(int a,float b) {
		System.out.println("In sub class...........");
	}
	public void method(String str) {
		
	}
}
public class MethodOverloading {

	public static void main(String args[]) {
		ABC1 obj = new C1();
		obj.method(0, 1.2f);
		C1 cObj = new C1();
		cObj.method("String");
		cObj.method(1.2f, 12);
		cObj.method(12, 11.34f);
	}

}
