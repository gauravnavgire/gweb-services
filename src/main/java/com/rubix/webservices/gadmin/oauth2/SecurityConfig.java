package com.rubix.webservices.gadmin.oauth2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order(Ordered.LOWEST_PRECEDENCE - 6)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("dataSource")
	DataSource dataSource;

	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Autowired
	private CommonPasswordEncoder commonPasswordEncoder;

	@Autowired
	private Environment env;

	@Override
	public void configure(WebSecurity web) throws Exception {
		// web.ignoring().antMatchers("/api/v1/**");
		// web.ignoring().antMatchers("/api/v1/**");
	}

	protected void configure(HttpSecurity http) throws Exception {

		http
				// Just for laughs, apply OAuth protection to only 2 resources
				.requestMatchers().antMatchers("/api/v1/masterconfig/**").and().authorizeRequests().anyRequest()
				.access("#oauth2.hasScope('read')");
		http.csrf().disable();
		return;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {

		authManagerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(commonPasswordEncoder);
	}

}
