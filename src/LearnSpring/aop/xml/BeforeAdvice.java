package LearnSpring.aop.xml;

import java.util.logging.Level;
import java.util.logging.Logger;


public class BeforeAdvice {
	private Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 * m为代理的方法，args为传递的参数，target为被代理类
	 */
	public void before() {
		
		log.log(Level.INFO, "delete ......");
	}

}
