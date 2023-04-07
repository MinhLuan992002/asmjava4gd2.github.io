package com.poly.dao.impl;

import java.util.List;

import com.poly.dao.AbstractDao;
import com.poly.dao.HistoryDao;
import com.poly.entity.History;

public class HistoryDaoImpl extends AbstractDao<History> implements HistoryDao {

	public List<History> findByUser(String username) {
		// TODO Auto-generated method stub
		String sql ="SELECT o FROM Favorites o WHERE o.user.username= ?0 AND o.video.Active = 1";
		return super.findMany(History.class, sql,username);
	}

	public List<History> findByUserIsLiked(String username) {
		String sql ="SELECT o FROM Favorites o WHERE o.user.username= ?0 AND o.video.Active = 1";
		return super.findMany(History.class, sql, username);
	}

	public History finByUserIdAndVideoId(Integer userId, Integer videoId) {
		// TODO Auto-generated method stub
		return null;
	}

	public History create(History entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public History update(History entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
