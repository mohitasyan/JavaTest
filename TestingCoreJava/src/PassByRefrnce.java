class Test {
	int a;
	int b;
	String str;
	Test(int x,int y,String s){
		a=x;
		b=y;
		str=s;
	}
	void swap(int x,int y){
		
		
	}
	void swap(Test t){
		
	}
	String swapStr(){
		 this.str="abcdgf";
		return this.str;
	}
}

public class PassByRefrnce {
public static void main(String args[]) {
	Test t1 = new Test(12,23,"xyz");
	Test t2 = t1;
	System.out.println(t1.a+"   "+t1.b);
	System.out.println(t2.a+"   "+t2.b);
	swap(t1);
	System.out.println(t1.a+"   "+t1.b);
	System.out.println(t2.a+"   "+t2.b);
	String str = t1.swapStr();
	System.out.println(str);
	
}
static void swap(Test x) {
	x.a=100;
	x.b=200;
}
}