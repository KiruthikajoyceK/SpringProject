package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.main")
@EnableWebMvc
@Import(value={LoginSecurityConfig.class})
public class LoginApplicationConfig {
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		//viewResolver.setViewClass(");
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}

}
