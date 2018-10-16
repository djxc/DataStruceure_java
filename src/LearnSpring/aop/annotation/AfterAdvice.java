package LearnSpring.aop.annotation;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect()
public class AfterAdvice{
	private Logger log = Logger.getLogger(this.getClass().getName());

	@After("execution ( * LearnSpring.ConnectDB.UserDao.*(..)) ")
	public void afterReturning() {
		log.log(Level.INFO, "after delete");
	}
	
	

}
