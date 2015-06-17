package com.teamtter.spring.helloworld.contextimport;


import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.teamtter.spring.helloworld.contextimport.contexts.ChildContext;
import com.teamtter.spring.helloworld.contextimport.service.Module;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	private void start() throws Exception {
		AnnotationConfigApplicationContext childContext = new AnnotationConfigApplicationContext(ChildContext.class);
		Map<String, Module> allModuleBeans = childContext.getBeansOfType(Module.class);
		for (Module module : allModuleBeans.values()) {
			log.info(module.toString());
		}
	}

	public static void main(String[] args) throws Exception {
		Main clientApp = new Main();
		clientApp.start();
	}

}