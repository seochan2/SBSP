package com.seochan2.sbspg.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	 @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(localeChangeInterceptor()).addPathPatterns("/**");
	   }
	 
	 @Override
	    public void configureViewResolvers(ViewResolverRegistry registry) {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	        viewResolver.setViewClass(JstlView.class);
	        registry.viewResolver(viewResolver);
	    }
	 
	 @Bean
	   public LocaleResolver localeResolver() {
	      SessionLocaleResolver localeResolver = new SessionLocaleResolver();
	      
	      return localeResolver;
	   }
	 
	@Bean
	   public LocaleChangeInterceptor localeChangeInterceptor() {
	      LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
	      localeChangeInterceptor.setParamName("lang");
	      
	      return localeChangeInterceptor;
	   }


}
