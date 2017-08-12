package com.travel.repository;

import org.springframework.data.repository.CrudRepository;

import com.travel.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
