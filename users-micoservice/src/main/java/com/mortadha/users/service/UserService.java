package com.mortadha.users.service;

import com.mortadha.users.entities.Role;
import com.mortadha.users.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
}
