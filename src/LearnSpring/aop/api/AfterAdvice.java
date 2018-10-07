package LearnSpring.aop.api;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{
	private Logger log = Logger.getLogger(this.getClass().getName());

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) 
			throws Throwable {
		log.log(Level.INFO, "after delete");
	}
	
	

}
