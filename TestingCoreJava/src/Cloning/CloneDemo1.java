package Cloning;
class A {
	int x;
	String y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public A(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return this.getX()+ "   "+ this.getY();
	}
}
class Demo implements Cloneable{
	int a;
	A aObj;
	String b;
	
	
	
	public Demo(int a, A aObj, String b) {
		super();
		this.a = a;
		this.aObj = aObj;
		this.b = b;
	}



	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public A getaObj() {
		return aObj;
	}



	public void setaObj(A aObj) {
		this.aObj = aObj;
	}



	public String getB() {
		return b;
	}



	public void setB(String b) {
		this.b = b;
	}



	public Demo clone() {
		try {
			return (Demo) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String toString() {
		return (this.getA()+"   "+this.getaObj()+"  "+this.getB());
		
	}
}
public class CloneDemo1 {
public static void main(String args[]) {
	A a = new A(12,"Mohita");
	Demo obj = new Demo(1,a,"Rozer");
	System.out.println("Original Object is............"+obj);
	Demo clonedObj = obj.clone();
	System.out.println("Original Object is............"+clonedObj);
	obj.setA(7878);
	a.setX(1212);
	a.setY("abcdefgh");
	obj.setaObj(a);
	obj.setB("qwertyuhuguy");
	System.out.println("Original Object is............"+obj);
	clonedObj.setaObj(a);
	System.out.println("Original Object is............"+clonedObj);
}
}
