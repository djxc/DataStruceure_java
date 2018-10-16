package LearnSpring.JDBC;

public class User {
	public int id;
	public String name;
	public int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
}
