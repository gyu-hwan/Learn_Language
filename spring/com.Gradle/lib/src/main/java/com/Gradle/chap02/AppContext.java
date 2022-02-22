package com.Gradle.chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean
	public Greeterr gree_ter() {
		Greeterr g=new Greeterr();
		g.setFormat("%s,안녕하세요.");
		return g;
	}
	
}
