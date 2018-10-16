package LearnSpring.aop.annotation;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdvice {
	private Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 * mΪ����ķ�����argsΪ���ݵĲ�����targetΪ��������
	 */
	@Before("execution ( * LearnSpring.ConnectDB.UserDao.*(..))")
	public void before() {
		log.log(Level.INFO, "delete ......");
	}

}
