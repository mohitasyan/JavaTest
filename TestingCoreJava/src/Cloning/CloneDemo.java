package Cloning;

import java.util.ArrayList;
import java.util.List;

class Test implements Cloneable{
	int a;
	String b;
	List lst;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public List getLst() {
		return lst;
	}
	public void setLst(List lst) {
		this.lst = lst;
	}
	
	
	public Test(int a, String b, List lst) {
		super();
		this.a = a;
		this.b = b;
		this.lst = lst;
	}
	public Test clone() {
		try {
			return (Test) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String toString() {
		return this.a+"  "+this.b+"  "+this.lst;
	}
	
}


public class CloneDemo {
public static void main(String main[]) {
    List list = new ArrayList();
    list.add("Libsys");
    list.add("Global Logic");
	Test obj = new Test(1,"Mohita",list);
	Test cloneObj = obj.clone();
	System.out.println("Original object is................"+obj);
	System.out.println("Clone object is..................."+cloneObj);
	obj.setA(2);
	obj.setB("Rozer");
	//list = new ArrayList();
	list.add("Siemens");
	list.add("Dosaan");
	list.add("Toshiba");
	obj.setLst(list);
	System.out.println("Original object is................"+obj);
	
	System.out.println("Clone object is..................."+cloneObj);
	
}
}
