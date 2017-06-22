package com.jpaexample.jpainterface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpaexample.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	List<User> findByAddressAndFullname(String address,String fullname);

	User findOne(int i);
}
