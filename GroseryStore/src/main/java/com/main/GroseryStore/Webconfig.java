package com.main.GroseryStore;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig  implements WebMvcConfigurer{
	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	            .addResourceHandler("/media/**")
	            .addResourceLocations("file:/D:/e/Git/GroseryStore/src/main/resources/static/media/");
	    }

}
