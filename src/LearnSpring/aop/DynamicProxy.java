package LearnSpring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DynamicProxy implements InvocationHandler{

	private Logger log = Logger.getLogger(this.getClass().getName());
	private Object ob;
	
	/**
	 * 绑定被代理的类,返回代理类的实例
	 * @param ob
	 * @return
	 */
	public Object bind(Object ob){
		this.ob = ob;
		return Proxy.newProxyInstance(ob.getClass().getClassLoader(), 
				ob.getClass().getInterfaces(), this);
	}
	
	/**
	 * 代理的一些方法，自己设定业务逻辑。调用被代理类的方法时会自动调用此方法。
	 * args是传递来的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws Throwable {
		log.log(Level.INFO, "before delete");
		System.out.println(args[0]);
		Object obj = method.invoke(ob, args);
		log.log(Level.INFO, "after delete");
		return obj;
	}
	
}
