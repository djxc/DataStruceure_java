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
	 * ʹ��ApplicationContext��Ϊ���������ж���Ĵ������Լ���������ע��
	 * 1.���ȴ���ApplicationContext������Ҫ����beans.xml�ļ�
	 * 2.ͨ��ApplicationContext�����ȡbean����ͨ��getBean��������Ҫ����xml�е����������id
	 * 3.����bean������ط���
	 */
	public static void testAppl(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		UserDaoImpl userd = (UserDaoImpl) context.getBean("UserDao");
		userd.register(new User());
		
//		ConnectUtil util = (ConnectUtil) factory.getBean("connUtil");
//		System.out.println(util.getConnect());
		
//		Computer computer = (Computer) factory.getBean("c");	// ��ȡjavabean�࣬��Ҫ�ṩxml�ļ��еĶ�Ӧ������
//		computer.read();
		
		TellName tname = (TellName) context.getBean("dj");
		System.out.println(tname.TeName());
	}
	
	/**
	 * ����BeanFactory��Ϊ������������ע��
	 */
 	public static void testBeanFactory(){
		Resource r = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		TellName tname = (TellName) factory.getBean("dj");
		System.out.println(tname.TeName());
	}
	
	/**
	 * ����Properties��ȡProperties�ļ��е����ԣ�Ȼ��Զ�����и�ֵ
	 */
	public static void testProperties(){
		Properties pro = new Properties();
		String name = null;
		try {
			//	��ȡproperties�ļ��е�����
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
