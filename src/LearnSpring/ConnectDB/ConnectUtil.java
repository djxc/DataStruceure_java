package LearnSpring.ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectUtil {
	private String name;
	private String password;
	private String url;
	private String driver;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public Connection getConnect(){
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, name, password);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return null;
	}
	
}
