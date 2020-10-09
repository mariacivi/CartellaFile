package service;

public interface AuthenticationService {

	public boolean login(String username, String password);
	public void logout();
	public boolean isOpenSession();
	
}
