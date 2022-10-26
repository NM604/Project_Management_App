package com.cg.pma.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.pma.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
