package firstProgect;

public class UserDaoImpl implements UserDao{
	private ConnectUtil connUtil;

	public void setConnUtil(ConnectUtil connUtil) {
		this.connUtil = connUtil;
	}

	@Override
	public void register(User u) {
		System.out.println(connUtil.getConnect());
		System.out.println("register is already");
	}
	
}
