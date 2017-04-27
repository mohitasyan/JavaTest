package Cloning;
class Address implements Cloneable {
	int streetNo;
	String colonyName;
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getColonyName() {
		return colonyName;
	}
	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}
	public Address(Address addr) {
		
	}
	
	
	public Address(int i, String string) {
		this.streetNo = i ;
		this.colonyName = string;
	}
	public String toString() {
		return (this.getStreetNo()+"   "+this.getColonyName());
	}
	
//	public Address clone() throws CloneNotSupportedException {
//		return (Address) super.clone();
//	}
}
class Voter implements Cloneable{
	String name;
	int id;
	Address addr;
	
	public Voter(String name, int id, Address addr) {
		
		this.name = name;
		this.id = id;
		this.addr =addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddr() {
		return addr;
	}
	
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public Voter clone() throws CloneNotSupportedException {
        Voter clone = (Voter) super.clone();
     	return clone;
	}
	
}
public class DeepShallowCloning {
public static void main(String args[]) throws CloneNotSupportedException {
	Address addr = new Address(85,"ABCD");
	Voter obj = new Voter("Mohita",1,addr);

	Voter clonedObj = (Voter)obj.clone();
	
	System.out.println(obj.getId()+"  "+obj.getName()+"  "+obj.getAddr());
	
	System.out.println("Cloned Object is......"+clonedObj.getId()+"  "+clonedObj.getName()+"  "+clonedObj.getAddr());
	
	obj.setId(2);
	obj.setName("Rozer");
	Address addr1 = new Address(92,"ABCDrhjjgtfrdfrdc");
	obj.setAddr(addr1);
	System.out.println(obj.getId()+"  "+obj.getName()+"  "+obj.getAddr());
	
	System.out.println("Cloned Object is......"+clonedObj.getId()+"  "+clonedObj.getName()+"  "+clonedObj.getAddr());
}
}
