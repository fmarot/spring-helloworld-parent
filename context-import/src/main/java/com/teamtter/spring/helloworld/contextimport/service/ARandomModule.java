package com.teamtter.spring.helloworld.contextimport.service;

public class ARandomModule implements Module {

	private DataManager datamanager;

	public ARandomModule(DataManager datamanager) {
		this.datamanager = datamanager;
	}

	@Override
	public String toString() {
		return "I am: " + this.getClass().getSimpleName() + " with a " + datamanager.getClass().getSimpleName()
				+ " passed in the constructor";
	}
}
