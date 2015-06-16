package com.teamtter.spring.helloworld.contextimport.contexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.teamtter.spring.helloworld.contextimport.service.ARandomModule;

@Import(MainContext.class)
@Configuration
public class ChildContext {

	@Bean
	public ARandomModule ARandomModule() {
		return new ARandomModule();
	}

}