package org.springframework.analysis.bean.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "org.springframework.analysis.bean")
@Component
public class AppConfig {

}
