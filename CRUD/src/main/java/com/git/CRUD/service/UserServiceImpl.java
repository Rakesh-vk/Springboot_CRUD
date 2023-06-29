package com.git.CRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.git.CRUD.model.User;
import com.git.CRUD.repository.UserRepsitory;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepsitory userRepo;
	
	@Override
	public Optional<User> getUser(Long ids) {
		// TODO Auto-generated method stub
		return userRepo.findById(ids);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public User updateUser(User user) {
		User usertemp=userRepo.findById(user.getId()).get();
		usertemp.setFirst_name(user.getFirst_name());
		usertemp.setLast_name(user.getLast_name());
		usertemp.setEmail(user.getEmail());
		userRepo.save(usertemp);
		return usertemp;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

}
