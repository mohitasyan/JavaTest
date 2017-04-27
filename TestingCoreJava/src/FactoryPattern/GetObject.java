package FactoryPattern;

public class GetObject {
   public static Shape CreateObj(String type){
	   if(type.equalsIgnoreCase("Circle")) {
		   return new Circle();
	   }
	   else if(type.equalsIgnoreCase("Square")) {
		   return new Square();
	   }
	   return null;
   }
   public static void main(String args[]) {
	   Shape s = CreateObj("Circle");
	   s.draw();
	   s = CreateObj("Square");
	   s.draw();
			   
   }
   
}
