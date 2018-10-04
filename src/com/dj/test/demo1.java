package com.dj.test;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import firstProgect.TellName;
import firstProgect.User;
import firstProgect.UserDaoImpl;

public class demo1 {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		UserDaoImpl userd = (UserDaoImpl) factory.getBean("UserDao");
		userd.register(new User());
//		ConnectUtil util = (ConnectUtil) factory.getBean("connUtil");
//		System.out.println(util.getConnect());
//		Computer computer = (Computer) factory.getBean("c");	// 获取javabean类，需要提供xml文件中的对应的名称
//		computer.read();
//		TellName tname = (TellName) factory.getBean("dj");
//		System.out.println(tname.TeName());
	}
	
	public static void testProperties(){
		Properties pro = new Properties();
		String name = null;
		try {
			//	获取properties文件中的属性
			pro.load(demo1.class.getClassLoader().getResourceAsStream("name.properties"));
			name = pro.getProperty("name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		TellName tname = new TellName();
		tname.setName(name);
		System.out.println(tname.TeName());
	}
}
