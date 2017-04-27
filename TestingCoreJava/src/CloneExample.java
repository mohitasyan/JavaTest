import java.util.*;
import java.awt.*;
class Employee implements Cloneable {

 private String name;
 private String designation;

 public Employee() {
 
 }
 public String getDesignation() {
 return designation;
 }

 public void setDesignation(String designation) {
 this.designation = designation;
 }

 public String getName() {
 return name;
 }

 public void setName(String name) {
 this.name = name;
 }

 public Object clone() throws CloneNotSupportedException {
 
 return super.clone();
 }
 public boolean equals(Object obj) {
	 Employee emp = (Employee) obj;
	 if(this.getName().equals(emp.getName()) && this.getDesignation().equals(emp.getDesignation())){
		 return true;
	 }
	 return false;
 }
 
}
//shallow cloning example
public class CloneExample {
	 public static void main(String arg[]){
		 Employee jwz = new Employee();
		 jwz.setName("Jamie Zawinski");
		 jwz.setDesignation("programmer");
		 try {
		 System.out.println("Shallow cloning............................."); 	 
		 Employee joel = (Employee) jwz.clone();
		 System.out.println(jwz.getClass()==joel.getClass());
		 System.out.println(jwz==joel);
		 System.out.println(jwz.equals(joel));
		 System.out.println(joel.getName());
		 System.out.println(joel.getDesignation());
		 System.out.println("Deep cloning............................."); 
//		 Cloner cloner=new Cloner();
//		 joel = Employee(ObjectCloner.deepCopy(jwz));
		// Object.class.
		// SerializationUtils.clone(object1);
		 } catch (CloneNotSupportedException cnse) {
		 System.out.println("Cloneable should be implemented. " + cnse );
		 }
		 }
}
