package com.teamtter.spring.helloworld.contextimport;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.teamtter.spring.helloworld.contextimport.contexts.ChildContext;
import com.teamtter.spring.helloworld.contextimport.contexts.MainContext;
import com.teamtter.spring.helloworld.contextimport.service.DataManager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	private void start() throws Exception {
		AnnotationConfigApplicationContext mainContext = new AnnotationConfigApplicationContext(MainContext.class);
		
		AnnotationConfigApplicationContext childContext = new AnnotationConfigApplicationContext(ChildContext.class);
		
		DataManager bean = childContext.getBean(DataManager.class);
		
		log.warn("{}", bean.toString());
	}

	public static void main(String[] args) throws Exception {
		Main clientApp = new Main();
		clientApp.start();
	}

}