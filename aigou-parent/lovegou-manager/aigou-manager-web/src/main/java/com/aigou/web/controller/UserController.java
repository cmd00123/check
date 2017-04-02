package com.aigou.web.controller;




import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aigou.pojo.User;
import com.aigou.service.UserService;
import com.sun.tools.internal.ws.processor.model.Request;


@Controller  
public class UserController {
	@Autowired
	private UserService userService;
	
	
	
	
	@RequestMapping("/login")
	public String login(String username,String password,Model model){
		if(userService.getUserByName(username, password) == true){
			return "index";
		}else{
			return "login";
		}
		
	}
	@RequestMapping("/register")
	public String register(String user,String passwd,String phone,String email,Model model){
		//如果查询出用户说明账户名已经存在了
		if(userService.getUserByName(user) == true){
			model.addAttribute("isRegisted", "1");
			System.out.println("此用户已经存在");
		}else{
			User users = new User(user,passwd,phone,email);
			users.setCreated(new Date());
			userService.addUser(users);
			System.out.println("用户添加成功");
			return "success";
		}
		return "success";
	}
}