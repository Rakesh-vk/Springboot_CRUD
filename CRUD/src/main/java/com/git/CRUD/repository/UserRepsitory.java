package com.git.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.git.CRUD.model.User;

@Repository
public interface UserRepsitory extends JpaRepository<User,Long>{

}
