package com.gpushop.backend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

	@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Allow requests from all origins, you may want to restrict this in production
        config.addAllowedOrigin("http://localhost:3000/");

        // Allow specific HTTP methods (GET, POST, PUT, DELETE, etc.)
        config.addAllowedMethod("*");

        // Allow specific HTTP headers in the request
        config.addAllowedHeader("*");

        // Expose specific headers in the response (if needed)
        // config.addExposedHeader("header-name");

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
