package com.poly.service.impl;

import java.util.List;

import com.poly.dao.VideoDao;
import com.poly.dao.impl.VideoDaoImpl;
import com.poly.entity.Video;
import com.poly.service.VideoService;

public class VideoServiceImpl implements VideoService {
	private VideoDao dao;
	public VideoServiceImpl() {
		dao= new VideoDaoImpl();
	}
	public Video findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	public List<Video> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public List<Video> findAll(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return dao.findAll(pageNumber, pageSize);
	}

	public Video create(Video entity) {
		// TODO Auto-generated method stub
		entity.setActive(Boolean.TRUE);
		entity.setViews(0);
		return dao.create(entity);
	}

	public Video update(Video entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	public Video delete(Video entity) {
		// TODO Auto-generated method stub
		return dao.delete(entity);
	}
}



