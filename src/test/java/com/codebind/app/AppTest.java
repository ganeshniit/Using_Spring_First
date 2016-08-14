package com.codebind.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppTest 
{
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("web.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		 App a=(App)factory.getBean("student");
		 System.out.println(a.getName()+a.getAddress());
	}
}