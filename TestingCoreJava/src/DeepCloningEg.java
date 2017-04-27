class Stu implements Cloneable{
	int rollNo;
	String name;
	Dept dep;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getDep() {
		return dep;
	}
	public void setDep(Dept dep) {
		this.dep = dep;
	}
	
	public Object clone() {
		return null;
		
	}

}
class Dept {
	int deptno;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
public class DeepCloningEg {
public static void main(String args[]){
	
}
}
