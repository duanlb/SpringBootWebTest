package com.base.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *@author duanlb
 *@date 2017年2月14日 上午11:18:52
 *
**/
//@EnableWebMvc
@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter{

	@Override  
    public void addViewControllers(ViewControllerRegistry registry) {  
        registry.addViewController("/welcome").setViewName("welcome.html");  
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);  
    }
    
    @Override  
    public void configurePathMatch(PathMatchConfigurer configurer) {  
        super.configurePathMatch(configurer);  
        
        configurer.setUseSuffixPatternMatch(false);  
    }
    

}
