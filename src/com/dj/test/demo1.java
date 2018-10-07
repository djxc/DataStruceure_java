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
import LearnSpring.ConnectDB.UserDao;
import LearnSpring.ConnectDB.UserDaoImpl;
import LearnSpring.aop.DynamicProxy;
import LearnSpring.aop.UserProxy;

public class demo1 {
	public static void main(String[] args) {
		aop_api();
	}
	
	/**
	 * aop的api的实现方式
	 * 通过实现advice接口进行拦截，在bean.xml中设置拦截的类，在拦截类中实现相应的功能。
	 * 这里将被代理类的每个方法都拦截了
	 * 被代理的类，以及实现的接口
	 */
	public static void aop_api(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userd = (UserDao) context.getBean("loggingProxy");
		userd.delete("dj");
		userd.register(new User());
	}
	
	/**
	 * 测试代理模式
	 */
	public static void testProxy(){
		//未使用代理
		UserDao userdao = new UserDaoImpl();
		userdao.delete("dj");
		
		//使用静态代理，只能代理设定好的类
		UserDao userProxy = new UserProxy(new UserDaoImpl());
		userProxy.delete("xc");
		
		//使用动态代理，动态代理可以代理任何一个类
		UserDao dynamicProxy = (UserDao) new DynamicProxy().bind(new UserDaoImpl());
		dynamicProxy.delete("djxc");
	
		
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
