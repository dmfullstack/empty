package com.cyan.container;

import java.util.HashMap;
import java.util.Map;

import com.cyan.container.dao.GoldenDao;
import com.cyan.container.dao.PremiumDaoImpl;
import com.cyan.container.service.FirstService;
import com.cyan.container.service.FirstServiceImpl;

public class Container {

	private static Map<String, Object> components;

	public static synchronized void init() {
		System.out.println("Initialize container");
		
		if (components == null) {
			components = new HashMap<String, Object>();
			
			GoldenDao dao = new PremiumDaoImpl();
			components.put("premiumDao", dao);
			
			FirstService service = new FirstServiceImpl();
			components.put("firstService", service);
			
			service.setDao(dao);
		}
	}

	public static Object getComponent(String id) {
		return components.get(id);
	}
}
