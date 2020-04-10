package org.springframework.analysis.bean.factorybean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarFactoryBeanTest {
	@Test
	public void concurrent(){
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}