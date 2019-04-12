package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {

                @Autowired
                public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
                                authenticationMgr.inMemoryAuthentication()
                                                .withUser("revathi")
                                                .password("reva")
                                                .authorities("ROLE_USER");
                }
                
                @Override
                protected void configure(HttpSecurity http) throws Exception {
                                http.authorizeRequests()
                                                .antMatchers("/Success").access("hasRole('ROLE_USER')")
                                                .and()
                                                                .formLogin().loginPage("/loginPage")
                                                                .defaultSuccessUrl("/Success")
                                                                .failureUrl("/loginPage?error")
                                                                .and()
                                                                .logout().logoutSuccessUrl("/loginPage?logout"); 
                                
                }*/

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception
	{
		authenticationManagerBuilder.inMemoryAuthentication().withUser("kiruthika").password("joyce").roles("admin");
	}
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.authorizeRequests().antMatchers("/success").access("hasRole('admin')")
		.and()
		.formLogin().loginPage("/loginpage").defaultSuccessUrl("/success").failureUrl("/loginpage?error")
		.and()
		.logout().logoutSuccessUrl("/loginpage?logout");
	}
	
}
