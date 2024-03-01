package BankingService;

public class CutomerRegistrationInBankImpClass  implements CustomerRegistrationATBank{
	public LoginDao dao;
	public CutomerRegistrationInBankImpClass(LoginDao dao) {
		this.dao=dao;
	}
	public String register(String name,String key){
		if(name.equalsIgnoreCase("") && key.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("Invalid");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   boolean b=dao.verify(name, key);
	   String result=b?"Valid":"Invalid";
	   return result;
	}
	public boolean add(String name,String key) {
		if(name.equalsIgnoreCase("")&& key.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("invalid");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean b=dao.register(name, key);
		return b;
		
	}
}
