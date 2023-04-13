package com.s_giken.traning.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain springSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                (requests) -> requests.requestMatchers("/", "/**").hasRole("USER"))
                .formLogin((formLogin) -> formLogin.loginPage("/login")
                        .failureForwardUrl("/login-error").permitAll());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        var user = User.withDefaultPasswordEncoder().username("user").password("password")
                .roles("USER").build();
        return new InMemoryUserDetailsManager(user);
    }
}
