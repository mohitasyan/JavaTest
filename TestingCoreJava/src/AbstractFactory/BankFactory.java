package AbstractFactory;

public class BankFactory extends AbsFactory {

	@Override
	public Bank getBank(String Bank) {
		if(Bank.equalsIgnoreCase("HDFC")) {
			return new HDFCBank();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School getSchool(String School) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
