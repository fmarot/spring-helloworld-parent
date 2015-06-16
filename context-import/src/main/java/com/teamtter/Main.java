package com.teamtter;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.teamtter.spring.helloworld.contextimport.ChildContext;
import com.teamtter.spring.helloworld.contextimport.MainContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	private void start() throws Exception {
		AnnotationConfigApplicationContext mainContext = new AnnotationConfigApplicationContext(MainContext.class);
		
		AnnotationConfigApplicationContext childContext = new AnnotationConfigApplicationContext(ChildContext.class);
		
		Toto1 bean = childContext.getBean(Toto1.class);
		
		log.warn("{}", bean.whoAmI());
	}

	public static void main(String[] args) throws Exception {
		Main clientApp = new Main();
		clientApp.start();
	}

}