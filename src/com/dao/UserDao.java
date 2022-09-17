package com.dao;


import com.model.UserModel;

public interface UserDao {

	public UserModel selectUser(UserModel user);
	public int selectUserNo(UserModel user);
	public void registerUser(UserModel user);
	public String selectUserNameByNo(int userNo);
	
}
