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
		// DefaultListableBeanFactory是整个Bean加载的核心部分，是Spring注册及加载Bean的默认实现
		// bean的定义被解析成 BeanDefinition，同时解析得到 beanName，
		// 将beanName和BeanDefinition存储到beanDefinitionMap中，
		// 同时会将beanName存储到beanDefinitionNames中
		PersonBean personBean = context.getBean(PersonBean.class);
		System.out.println(personBean.getStudent().getName());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}
}
