package com.poly.dao;

import java.util.List;

import com.poly.entity.Video;

public interface VideoDao {
	Video findById(Integer id);
	List<Video> findAll();
	List<Video> findAll(int pageNumber,int pageSize);
	Video create(Video entity);
	Video update(Video entity);
	Video delete(Video entity);
	
}
