package LearnSpring.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestJDBC {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userd = (UserDao) context.getBean("userDao");
		userd.save(new User("xc", 25));
	}
}
