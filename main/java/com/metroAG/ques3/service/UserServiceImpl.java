package com.metroAG.ques3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.metroAG.ques3.entities.User;
import com.metroAG.ques3.exception.UserNotFoundException;
import com.metroAG.ques3.repo.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao udao;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return udao.findAll();
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		udao.save(user);
		return user;
	}

	@Override
	public User getUser(int id) throws UserNotFoundException{
		// TODO Auto-generated method stub
		User user=udao.findById(id).get();	
		if(user==null)
			throw new UserNotFoundException("User 404");
		return user;
		
	}

	@Override
	public List<User> sortUsers() {
		// TODO Auto-generated method stub
		return udao.findAll(Sort.by("email").ascending());
	}
	

}
