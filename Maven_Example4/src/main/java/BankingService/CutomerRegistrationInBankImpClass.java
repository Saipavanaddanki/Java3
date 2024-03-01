package BankingService;

public class CutomerRegistrationInBankImpClass  implements CustomerRegistrationATBank{
	private LoginDao dao;
	public CutomerRegistrationInBankImpClass(LoginDao dao) {
		this.dao=dao;
	}
	public String register(String name,String key) {
		if(name.equalsIgnoreCase("") && key.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("Invalid");
		}
	   boolean b=dao.verify(name, key);
	   String result=b?"Valid":"Invalid";
	   return result;
	}
}
