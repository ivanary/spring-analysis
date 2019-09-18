package org.springframework.analysis.bean.processor;

import org.springframework.analysis.bean.entity.PersonBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 *
 */
@Configurable
public class PersonBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		PersonBean personBean = beanFactory.getBean(PersonBean.class);
		personBean.getStudent().setName("hello");
	}
}
