package cn.com.wmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.wmc.model.UserModel;
import cn.com.wmc.service.UserService;

@Controller
public class IndexController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping("/index")
	public void testName(UserModel userModel) {

		userService.insertUser(userModel);

		
	}

}
