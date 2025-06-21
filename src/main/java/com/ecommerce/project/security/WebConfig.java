package com.ecommerce.project.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${frontend.url}")
    String frontEndUrl;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //.allowedOrigins("185.199.108.153","http://localhost:3000","https://jayanta66.github.io/**","https://jayanta66.github.io/ce","https://jayanta66.github.io/ce/**", "https://sbecombackend-production.up.railway.app/**",frontEndUrl)
                .allowedOrigins("*")
             // .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
