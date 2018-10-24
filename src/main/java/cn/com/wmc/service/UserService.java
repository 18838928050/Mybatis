package cn.com.wmc.service;

import org.springframework.stereotype.Service;

import cn.com.wmc.model.UserModel;


@Service
public interface UserService {

	public void insertUser(UserModel userModel);
	
	public UserModel selectUser(Long id);
	
}
