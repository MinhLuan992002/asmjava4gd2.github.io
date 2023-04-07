package com.poly.dao.impl;

import java.util.List;

import com.poly.dao.AbstractDao;
import com.poly.dao.UserDao;
import com.poly.entity.User;

public class UserDaoImpl extends AbstractDao<User> implements UserDao {
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(User.class, id);
	}

	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		String sql="SELECT o FORM Users o where o.email=?0";
		return super.findOne(User.class, sql, email);
	}

	public User findByUsername(String username, String password) {
		String sql="SELECT o FORM Users o WHERE o.Fullname=?0";
		return super.findOne(User.class, sql, username);
	}

	public User findByUsernameAndPassword(String username, String password) {
		String sql="SELECT o FORM Users o WHERE o.Fullname=?0 AND o,Password=?1";
		return super.findOne(User.class, sql, username,password);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return  (User) super.findAll(User.class, true);
	}

	public List<User> findAll(int pageNumber, int pageSize) {
		
		return super.findAll(User.class, true, pageNumber, pageSize);
	}




}
