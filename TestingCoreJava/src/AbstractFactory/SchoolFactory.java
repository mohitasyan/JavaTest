package AbstractFactory;

public class SchoolFactory extends AbsFactory{

	@Override
	public Bank getBank(String Bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School getSchool(String School) {
		// TODO Auto-generated method stub
		if(School.equalsIgnoreCase("DAV")) {
			return new DAVSchool();
		}
		return null;
	}

}
