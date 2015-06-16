package com.teamtter.spring.helloworld.contextimport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.teamtter.Toto1;
import com.teamtter.Toto2;

@Import(MainContext.class)
@Configuration
public class ChildContext {

	@Bean
	public Toto1 toto() {
		return new Toto2();
	}
	
}