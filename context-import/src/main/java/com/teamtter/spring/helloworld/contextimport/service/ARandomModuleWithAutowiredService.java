package com.teamtter.spring.helloworld.contextimport.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ARandomModuleWithAutowiredService implements Module {

	@Autowired
	private DataManager datamanager;

	@Override
	public String toString() {
		return "I am: " + this.getClass().getSimpleName() + " with an autowired "
				+ datamanager.getClass().getSimpleName();
	}
}