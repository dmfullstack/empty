package com.cyan.container;

import com.cyan.container.service.FirstService;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Container.init();

		FirstService service = (FirstService) Container.getComponent("firstService");
		service.firstService();
	}
}
