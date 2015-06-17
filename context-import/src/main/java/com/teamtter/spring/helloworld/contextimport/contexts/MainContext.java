package com.teamtter.spring.helloworld.contextimport.contexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.teamtter.spring.helloworld.contextimport.service.DataManager;

@Configuration
public class MainContext {

	// Strange NullPointerException if this is uncommented :/
	// @Autowired
	// private ARandomModule randomModule;

	// Error if uncommented: Error creating bean with name 'DataManager': Requested bean is currently in creation: Is there an unresolvable circular reference?
	//	@Autowired
	//	private ARandomModuleWithAutowiredService aRandomModuleWithAutowiredService;

	@Bean
	public DataManager DataManager() {
		return new DataManager();
	}

}
