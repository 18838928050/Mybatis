/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: userController.java 
 *
 * @Date:  2018年10月24日  下午4:57:34
 *
 * @Package cn.com.wmc.controller
 */


package cn.com.wmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.wmc.model.UserModel;
import cn.com.wmc.service.UserService;

/**
 * @author fuhuifang
 * 
 * 日期：2018年10月24日 下午4:57:34
 *
 * 描述：
 * @version V1.0
 *
 */
@Controller
@RequestMapping(value = "/func/user")
public class userController {

	@Autowired
	private UserService userService;
	
	/*
	 * 增加用户
	 */
	@RequestMapping(value="insert_user")
	public void insertUser(UserModel userModel) {
		userService.insertUser(userModel);
	}
	
	
	/*
	 * 根据Id查询用户
	 */
	@RequestMapping(value="select_user")
	public UserModel selectUser(Long id){
		return userService.selectUser(id);
	}
	
	@RequestMapping(value="select_user")
	public void deleteUser() {
		
	}
	
	
	
}
