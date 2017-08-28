package com.travel.serviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.domain.Role;
import com.travel.domain.User;
import com.travel.repository.UserRepository;
import com.travel.service.*;


@Service
@Transactional
public class UserDetailsServiceImpl implements BaseServices<User>, UserDetailsService {


	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}

		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		Set<Role> roles = user.getRoles();
		for (Role role : roles) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				grantedAuthorities);
	}

	@Override
	public ArrayList<User> getAllObjet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getObject(Object key_get) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(User instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User instence) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User instence) {
		// TODO Auto-generated method stub
		return false;
	}





	

}
