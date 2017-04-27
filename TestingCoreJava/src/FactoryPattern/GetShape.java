package FactoryPattern;

public class GetShape extends AbstractFactory {

	@Override
	Shape getShape(String type) {
		// TODO Auto-generated method stub
		 if(type.equalsIgnoreCase("Circle")) {
			   return new Circle();
		   }
		   else if(type.equalsIgnoreCase("Square")) {
			   return new Square();
		   }
		return null;
	}
}
