package com.aigou.service;

import java.util.List;

import com.aigou.pojo.User;


public interface UserService {
	//用户的添加功能
		public int addUser(User user);
		//修改用户的方法
		public int updateUser(User user);
		//根据用户id删除用户的方法
		public int deleteUserById(long id);
		//根据用户id查询用户信息的方法
		public User getUserById(long id);
		//获取所有的用户
		public List<User> getAllUser();
		//根据用户名和用户密码查询用户
		public Boolean getUserByName(String username,String password);
		//根据用户名查询用户是否存在
		public Boolean getUserByName(String username);
}
