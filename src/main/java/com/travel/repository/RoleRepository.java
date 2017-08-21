package com.travel.repository;

import org.springframework.data.repository.CrudRepository;

import com.travel.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	Role findByName(String name);
}
