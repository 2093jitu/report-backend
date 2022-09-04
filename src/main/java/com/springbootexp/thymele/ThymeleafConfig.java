package com.springbootexp.thymele;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.mysoft.radiologyApp")
public class ThymeleafConfig implements WebMvcConfigurer, ApplicationContextAware {

	private static final String UTF_8 = "UTF-8";

	private ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setTemplateEngine(templateEngine());
		resolver.setCharacterEncoding("UTF-8");
		return resolver;
	}

	@Bean
	public TemplateEngine templateEngine() {
		return new SpringTemplateEngine();
	}

	//---IBU---
	public ClassLoaderTemplateResolver templateResolver(String folderName) {
		
		ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		
		templateResolver.setPrefix("thymeleafReport/"+folderName+"/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode(TemplateMode.HTML);
		templateResolver.setCharacterEncoding(UTF_8);
		templateResolver.setOrder(1);

		return templateResolver;
	}

}
