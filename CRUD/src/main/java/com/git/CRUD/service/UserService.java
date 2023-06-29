package com.git.CRUD.service;

import java.util.List;
import java.util.Optional;

import com.git.CRUD.model.User;

public interface UserService {
	public Optional<User> getUser(Long ids);
	public List<User> getAllUser();
	public void deleteUser(Long id);
	public User updateUser(User user);
	public User saveUser(User user);
}
