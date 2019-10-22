package com.jack.logo_provider_us.config.beetl;

import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * beetl配置
 */
@Configuration
public class BeetlConfig {


    @Bean(name = "beetlConfiguration")
    public BeetlGroupUtilConfiguration beetlGroupUtilConfiguration(){
        BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if (loader == null) {
            loader = BeetlConfig.class.getClassLoader();
        }
        ClasspathResourceLoader cploader = new ClasspathResourceLoader(loader, "templates");
        beetlGroupUtilConfiguration.setResourceLoader(cploader);
        beetlGroupUtilConfiguration.init();
        beetlGroupUtilConfiguration.getGroupTemplate().setClassLoader(loader);
        return beetlGroupUtilConfiguration;
    }


    @Bean(name = "beetlViewResolver")
    public BeetlSpringViewResolver beetlSpringViewResolver(
            @Qualifier("beetlConfiguration") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
        beetlSpringViewResolver.setContentType("text/html;charset=utf-8");
        beetlSpringViewResolver.setOrder(0);
        beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
        return beetlSpringViewResolver;
    }


}
