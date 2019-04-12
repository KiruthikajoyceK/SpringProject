package com.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class SpringMVCWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{


		
		protected Class<?>[] getRootConfigClasses() {
			return null;
			
			
		}

		
		protected Class<?>[] getServletConfigClasses() {
			
			return new Class[] {com.main.LoginApplicationConfig.class};
		}

		
		protected String[] getServletMappings() {
			
			return new String[] {"/"};
		}

	}

