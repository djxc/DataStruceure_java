package LearnSpring.aop.annotation;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdvice {
	private Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 * m为代理的方法，args为传递的参数，target为被代理类
	 */
	@Before("execution ( * LearnSpring.ConnectDB.UserDao.*(..))")
	public void before() {
		log.log(Level.INFO, "delete ......");
	}

}
