package com.travel.config;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.travel.repository.RoleRepository;
import com.travel.repository.UserRepository;
import com.travel.domain.Role;
import com.travel.domain.User;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// Roles
		if (roleRepository.findByName("ROLE_ADMIN") == null) {
			roleRepository.save(new Role("ROLE_ADMIN"));
		}

		if (roleRepository.findByName("ROLE_MANAGER") == null) {
			roleRepository.save(new Role("ROLE_MANAGER"));
		}

		if (roleRepository.findByName("ROLE_STAFF") == null) {
			roleRepository.save(new Role("ROLE_STAFF"));
		}
		
		
		//Init account
		if(userRepository.findByUsername("admin") == null) {
			User admin = new User();
			admin.setUsername("admin");
			admin.setPassword(passwordEncoder.encode("admin"));
			HashSet<Role> roles = new HashSet<>();
			roles.add(roleRepository.findByName("ROLE_ADMIN"));
			roles.add(roleRepository.findByName("ROLE_MANAGER"));
			roles.add(roleRepository.findByName("ROLE_STAFF"));
			admin.setRoles(roles);
			userRepository.save(admin);
		}
		
		if(userRepository.findByUsername("manager") == null) {
			User manager = new User();
			manager.setUsername("manager");
			manager.setPassword(passwordEncoder.encode("manager"));
			HashSet<Role> roles = new HashSet<>();
			roles.add(roleRepository.findByName("ROLE_MANAGER"));
			manager.setRoles(roles);
			userRepository.save(manager);
		}
		
		if(userRepository.findByUsername("staff") == null) {
			User manager = new User();
			manager.setUsername("staff");
			manager.setPassword(passwordEncoder.encode("staff"));
			HashSet<Role> roles = new HashSet<>();
			roles.add(roleRepository.findByName("ROLE_STAFF"));
			manager.setRoles(roles);
			userRepository.save(manager);
		}
		
	}

}
