package org.springframework.analysis.bean.test;

import org.springframework.analysis.bean.config.AppConfig;
import org.springframework.analysis.bean.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean的生命周期，读取配置，创建Bean， 配置Bean
 */
public class BeanTestClient {
	public static void main(String[] args) {
		initBean();
	}
	public static void initBean(){
		// init Spring Context(上下文， 环境， 容器）
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ac.getBean(PersonService.class);

	}
}
