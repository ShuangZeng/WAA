package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Role;

public interface RoleService {
	public List<Role> getAll();
	public Role get(Integer roleID);

}
