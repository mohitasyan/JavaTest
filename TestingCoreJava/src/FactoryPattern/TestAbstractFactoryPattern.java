package FactoryPattern;

public class TestAbstractFactoryPattern {
public static void main(String args[]) {
	GetShape obj = new GetShape();
	Shape s = obj.getShape("Circle");
	s.draw();
	s = obj.getShape("Square");
	s.draw();
}
}
