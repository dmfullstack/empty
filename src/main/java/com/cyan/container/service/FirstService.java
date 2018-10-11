package com.cyan.container.service;

import com.cyan.container.dao.GoldenDao;

public interface FirstService {

	public void setDao(GoldenDao dao); 
	public String firstService();
}
