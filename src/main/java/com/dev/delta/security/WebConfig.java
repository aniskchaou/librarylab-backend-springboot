package com.dev.delta.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Collections;
import java.util.List;

/*@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        jsonConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        converters.add(jsonConverter);
    }
}*/

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
    }

      /*  @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow all origins for all endpoints
        registry.addMapping("/**")
                .allowedOrigins("https://librarylab-frontend-72f7a60f7ba2.herokuapp.com") // Allow all origins
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow methods
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // If you need to allow cookies
    }*/
}
