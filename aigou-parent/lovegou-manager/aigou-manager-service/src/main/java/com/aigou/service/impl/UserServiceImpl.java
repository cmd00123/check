package com.aigou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aigou.mapper.UserMapper;
import com.aigou.pojo.User;
import com.aigou.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	@Override
	public int deleteUserById(long id) {
		return userMapper.deleteUserById(id);
	}

	@Override
	public User getUserById(long id) {
		return userMapper.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}
	/**
	 * 用户的名字name通过mybatis框架查询出一个User对象，看对象是否存在，如果对象存在则
	 * 通过对象得到对象的密码，然后检查密码是否相同，如果相同，返回true，如果不同则返回false不允许登录。
	 */
	@Override
	public Boolean getUserByName(String username,String password) {
		User user = userMapper.getUserByName(username);
		if(user != null){
			String pwd = user.getPassword();
			
			if(password.equals(pwd)){
				
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean getUserByName(String username) {
		User user = userMapper.getUserByName(username);
		if(user != null){
			return true;
		}
		return false;
	}

}
