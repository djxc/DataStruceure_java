package LearnSpring.JDBC;

public interface UserDao {
	public void save(User u);
	public void delete(int id);
	public void update(User u);
	public User getUsr(int id);
}
