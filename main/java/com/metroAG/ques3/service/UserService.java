package com.metroAG.ques3.service;
import java.util.List;

import com.metroAG.ques3.entities.*;


public interface UserService {
	public List<User> getUsers();

	public User addUser(User user);

	public User getUser(int id) ;

	public List<User> sortUsers();
}
