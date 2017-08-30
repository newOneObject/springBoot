package com.cao.configBean;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/8/28.
 */
@EnableWebMvc
@Configuration
public class webConfigBean extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/templates/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/templates/");
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
        super.addResourceHandlers(registry);
    }
}