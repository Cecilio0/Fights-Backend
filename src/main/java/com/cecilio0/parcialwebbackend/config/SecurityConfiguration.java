package com.cecilio0.parcialwebbackend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;
	
	@Autowired
	private AuthenticationProvider authenticationProvider;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
				.cors(Customizer.withDefaults())
				.csrf(AbstractHttpConfigurer::disable)
				.authorizeHttpRequests((authorize) ->
						authorize.requestMatchers(
								"/users/**", // Whitelisted authorization
										"v2/api-docs", // Whitelisted resources needed by swagger and openapi
										"/v3/api-docs",
										"/v3/api-docs/**",
										"/swagger-ui/**",
										"/swagger-ui.html",
										"/swagger-resources",
										"/swagger-resources/**",
										"/configuration/ui",
										"/configuration/security",
										"/webjars/**")
								.permitAll()
//								.requestMatchers( // Routes for requests that are only possible for administrators
//										"towers/update/**",
//										"towers/save",
//										"heroes/update/**",
//										"heroes/save",
//										"bloons/update/**",
//										"bloons/save",
//										"maps/update/**",
//										"maps/save")
//								.hasRole("ADMIN")
								.anyRequest()
								.authenticated())
				.sessionManagement((session) ->
						session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authenticationProvider(authenticationProvider)
				.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
		
		return httpSecurity.build();
	}


}
