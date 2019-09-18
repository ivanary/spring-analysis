package org.springframework.analysis.bean.bootsrap;

import org.springframework.analysis.bean.config.AppConfig;
import org.springframework.analysis.bean.config.PersonBeanConfig;
import org.springframework.analysis.bean.entity.PersonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class PersonBeanBootstrap {

	public static void main(String[] args) {
		// init Spring Context(上下文， 环境， 容器）
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonBean personBean = context.getBean(PersonBean.class);
		System.out.println(personBean.getStudent().getName());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}
}
