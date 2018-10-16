package LearnSpring.aop.xml;

import java.util.logging.Level;
import java.util.logging.Logger;


public class AfterAdvice {
	private Logger log = Logger.getLogger(this.getClass().getName());

	public void afterReturning() {
		log.log(Level.INFO, "after delete");
	}
	
	

}
