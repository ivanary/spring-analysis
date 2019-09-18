package org.springframework.analysis.bean.config;

import org.springframework.analysis.bean.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.annotation.Scope;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;


@Configuration
public class StudentConfig implements ImportAware {

	@Bean
	@Scope("prototype")
	public Student student(){
		Student student = new Student();
		student.setAge(22);
		student.setName("en-halo");
		return student;
	}

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		System.out.println("StudentConfig importAware");
	}
}
