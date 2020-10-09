package service;

import model.User;

public interface UsersService {

	public boolean updateUsername(String currentUsername, String newUsername);
	public boolean updatePassword(String currentUsername, String password);
	public User getUser(String username);
	
}
