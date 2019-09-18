package org.springframework.analysis.bean.config;

import org.springframework.analysis.bean.entity.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 *
 *
 */
@Configuration
@Import(StudentConfig.class)
public class PersonBeanConfig {
	@Autowired
	private StudentConfig studentConfig;

	@Bean
	public PersonBean personBean() {
		PersonBean personBean = new PersonBean(studentConfig.student());
		return personBean;
	}
}
