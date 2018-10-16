package LearnSpring.aop;

import java.util.logging.Level;
import java.util.logging.Logger;

import LearnSpring.ConnectDB.User;
import LearnSpring.ConnectDB.UserDao;

public class UserProxy implements UserDao{
	private Logger log = Logger.getLogger(this.getClass().getName());	
	private UserDao dao;
	
	public UserProxy(UserDao dao){
		this.dao = dao;
	}
	
	@Override
	public void delete(String name) {
		log.log(Level.INFO, "before delete");
		dao.delete(name);
		log.log(Level.INFO, "after delete");
	}

	@Override
	public void register(User u) {
		
	}

}
