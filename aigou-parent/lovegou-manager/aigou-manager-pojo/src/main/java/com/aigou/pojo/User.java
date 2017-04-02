package com.aigou.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//用户id
	private Long id;
	//用户名
	private String username;
	//用户密码(用md5加盐的方式加密)
	private String password;
	//用户电话
	private String phone;
	//用户邮件email
	private String email;
	//用户的注册时间
	private Date created;
	//用户的最后的登录时间
	private Date loginTime;
	//用户的等级
	private int level;
	//用户是否启用(0 or 1)
	private int on_off;
	
	public User() {
		super();
	}
	
	public User(String username, String password, String phone, String email) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User(Long id, String username, String password, String phone, String email, Date created, Date loginTime,
			int level, int on_off) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.created = created;
		this.loginTime = loginTime;
		this.level = level;
		this.on_off = on_off;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}
	public String getPassword() {
		return password  ;
	}
	public void setPassword(String password) {
		this.password = password == null? null : password.trim();;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getOn_off() {
		return on_off;
	}
	public void setOn_off(int on_off) {
		this.on_off = on_off;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", email="
				+ email + ", created=" + created + ", loginTime=" + loginTime + ", level=" + level + ", on_off="
				+ on_off + "]";
	}
	
}
