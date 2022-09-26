package com.app.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ProjectSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        http
//                .authorizeRequests()
//                .antMatchers("/myAccount").authenticated()
//                .antMatchers("/myBalance").authenticated()
//                .antMatchers("/myLoans").authenticated()
//                .antMatchers("/myCards").authenticated()
//                .antMatchers("/contacts").permitAll()
//                .antMatchers("/notices").permitAll()
//                .and()
//                .formLogin().and()
//                .httpBasic();

        http
                .authorizeRequests().anyRequest().permitAll()
                .and().formLogin()
                .and().httpBasic();
    }
}
