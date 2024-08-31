package com.thepub.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig  {
	
//	public FilterRegistrationBean coresFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.addAllowedOriginPattern("*");
//		corsConfiguration.addAllowedHeader("Authorizration");
//		corsConfiguration.addAllowedHeader("Content-Type");
//		corsConfiguration.addAllowedHeader("Accept");
//		corsConfiguration.addAllowedHeader("Post");
//		corsConfiguration.addAllowedHeader("Get");
//		corsConfiguration.addAllowedHeader("Put");
//		corsConfiguration.addAllowedHeader("Delete");
//		corsConfiguration.addAllowedHeader("Options");
//		
//		source.registerCorsConfiguration("/**", corsConfiguration);
//		
//		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
//		return bean;
//	}
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				 registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173") // Change to your allowed origins
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
			}
		};
	}
}
