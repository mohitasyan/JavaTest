import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



class DT implements Comparable<DT> {
	int x;
	String y;
	
	public DT(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int compareTo(DT o) {
		return this.y.compareTo(o.y);
	}
	
	public String toString() {
		return this.x+"  "+this.y+"  ";
	}
}
public class DemoTest {
public static void main(String args[]) {
	DT o1 = new DT(1,"Mohita");
	DT o2 = new DT(2,"Rozer");
	DT o3 = new DT(3,"Piku");
	DT o4 = new DT(4,"Papa");
	DT o5 = new DT(5,"Sahil");
	DT o6 = new DT(6,"Littlu");
	List<DT> lst = new ArrayList<DT>();
	lst.add(o1);
	lst.add(o2);
	lst.add(o3);
	lst.add(o4);
	lst.add(o5);
	lst.add(o6);
	Collections.sort(lst);
	//System.out.println(lst);
	Map<DT,Object> m = new HashMap<DT,Object>();
	m.put(o1,"xyz");
	m.put(o2, 1);
	m.put(o3, "kjhkhk");
	m.put(o4,345);
	m.put(o5,3415);
	m.put(o6,34);
	System.out.println("Map is................."+m);
	Map<DT,Object> treeMap = new TreeMap<DT,Object>(m);
	System.out.println("Tree Map is.................."+treeMap);
	
	
	
//	Set<DT> keySet = m.keySet();
//	for(DT obj : keySet) {
//		System.out.println("  "+ obj.x+"  "+obj.y);
//	}
}
}
