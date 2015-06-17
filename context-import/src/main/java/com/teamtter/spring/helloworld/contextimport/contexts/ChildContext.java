package com.teamtter.spring.helloworld.contextimport.contexts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.teamtter.spring.helloworld.contextimport.service.ARandomModule;
import com.teamtter.spring.helloworld.contextimport.service.ARandomModuleWithAutowiredService;
import com.teamtter.spring.helloworld.contextimport.service.DataManager;

@Import(MainContext.class)
@Configuration
public class ChildContext {

	@Autowired
	private DataManager datamanager; // defined in the imported MainContext

	@Bean
	public ARandomModuleWithAutowiredService ARandomModuleWithAutowiredService() {
		return new ARandomModuleWithAutowiredService();
	}

	@Bean
	public ARandomModule ARandomModule() {
		return new ARandomModule(datamanager);
	}

}