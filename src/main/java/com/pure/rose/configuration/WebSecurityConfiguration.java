package com.pure.rose.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        // ignore swagger
        web.ignoring().antMatchers("/swagger-resources/**",
                                    "/swagger-ui/**",
                                    "/v3/api-docs",
                                    "/webjars/**");
    }
}
