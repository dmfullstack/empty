package com.cyan.container.service;

import com.cyan.container.dao.GoldenDao;

public class FirstServiceImpl implements FirstService {
	
	private GoldenDao dao;  
	
	public String firstService() {
		return dao.premiumMethod();
	}

	public void setDao(GoldenDao dao) {
		this.dao = dao;
	}

}
