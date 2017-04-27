import java.util.HashMap;

public class CloneTest implements Cloneable {
	private int id;
    private String name;
	private HashMap props;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap getProps() {
		return props;
	}
	public void setProps(HashMap props) {
		this.props = props;
	}
	
	public static void main(String args[]) throws CloneNotSupportedException {
		CloneTest ct1 = new CloneTest();
		ct1.setId(1);
		ct1.setName("first");
		HashMap hm = new HashMap();
		hm.put("1", "first");
		hm.put("2", "second");
		hm.put("3", "third");
		ct1.setProps(hm);
		// Using default clone() implementation
		CloneTest ct2;
		ct2 = (CloneTest) ct1.clone();
		// Check whether the ct1 and ct2 attributes are same or different
		System.out.println("ct1 and ct2 HashMap == test: "
		+ (ct1.getProps() == ct2.getProps()));
		// Lets see the effect of using default cloning
		ct1.getProps().put("4", "fourth");
		System.out.println("ct2 props:" + ct2.getProps());
		ct1.setName("new");
		System.out.println("ct2 name:" + ct2.getName());
	}
	
}
