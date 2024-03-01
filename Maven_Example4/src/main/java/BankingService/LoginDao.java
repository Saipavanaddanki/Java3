package BankingService;

public interface LoginDao {
	public boolean verify(String name,String key);
	public boolean register(String name,String key);
}
