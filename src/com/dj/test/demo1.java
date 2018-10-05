package com.dj.test;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import LearnSpring.TellName;
import LearnSpring.ConnectDB.User;
import LearnSpring.ConnectDB.UserDaoImpl;

public class demo1 {
	public static void main(String[] args) {

	}
	
	/**
	 * 使用ApplicationContext作为容器，进行对象的创建，以及管理依赖注入
	 * 1.首先创建ApplicationContext对象，需要输入beans.xml文件
	 * 2.通过ApplicationContext对象获取bean对象，通过getBean方法，需要输入xml中的依赖对象的id
	 * 3.操作bean对象相关方法
	 */
	public static void testAppl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		UserDaoImpl userd = (UserDaoImpl) context.getBean("UserDao");
		userd.register(new User());
		
//		ConnectUtil util = (ConnectUtil) factory.getBean("connUtil");
//		System.out.println(util.getConnect());
		
//		Computer computer = (Computer) factory.getBean("c");	// 获取javabean类，需要提供xml文件中的对应的名称
//		computer.read();
		
		TellName tname = (TellName) context.getBean("dj");
		System.out.println(tname.TeName());
	}
	
	/**
	 * 利用BeanFactory作为容器进行依赖注入
	 */
 	public static void testBeanFactory(){
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		TellName tname = (TellName) factory.getBean("dj");
		System.out.println(tname.TeName());
	}
	
	/**
	 * 利用Properties获取Properties文件中的属性，然后对对象进行赋值
	 */
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
