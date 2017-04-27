import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Emp implements Comparable {
	int empId;
	String name;
	public Emp(int empId, String name, String deptNo) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptNo = deptNo;
	}
	String deptNo;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public int compareTo(Object o1) {
		Emp x = (Emp) this;
		Emp y = (Emp) o1;
		return x.name.compareTo(y.name);
	
	}
	public String toString(){
		Emp e = this;
		return e.getEmpId() + " "+e.getName() + " "+ e.getDeptNo(); 
				
	}
	
}
public class Demo {
	public static void main(String args[]) {
		Emp e1 = new Emp(1,"mohita","T1");
		Emp e2 = new Emp(2,"piku","T2");
		Emp e3 = new Emp(3,"littlu","T1");
		Emp e4 = new Emp(4,"rozer","T3");
		Emp e5 = new Emp(5,"vishal","T4");
		List lst = new ArrayList();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		Collections.sort(lst,new Comparator(){
			public int compare(Object o1,Object o2) {
				Emp x = (Emp) o2;
				Emp y = (Emp) o1;
				return x.getEmpId() - y.getEmpId();
			
			}
		});
		System.out.println(lst);
	}

}
