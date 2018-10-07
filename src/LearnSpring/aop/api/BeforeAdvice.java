package LearnSpring.aop.api;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{
	private Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 * m为代理的方法，args为传递的参数，target为被代理类
	 */
	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		System.out.println(m.getName());
		System.out.println(args[0]);
		System.out.println(target.getClass().getName());
		log.log(Level.INFO, "delete ......");
	}

}
