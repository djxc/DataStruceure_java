package LearnSpring.JDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao{
	public JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(User u) {
		String sql = "insert into user(name, age) values(?, ?) ";		
		jdbcTemplate.update(sql, new Object[] {u.getName(), u.getAge()});		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUsr(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
