package cn.tedu.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	@Test
	public void test(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		SampleBean a = (SampleBean)ac.getBean("sampleBean");
		SampleBean b = (SampleBean)ac.getBean("sampleBean");
		System.out.println(a==b);
	}
}
