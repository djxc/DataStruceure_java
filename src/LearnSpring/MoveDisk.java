package LearnSpring;

public class MoveDisk implements USB{

	@Override
	public void read() {
		System.out.println("read by MoveDisk");		
	}

	@Override
	public void write() {
		System.out.println("write by MoveDisk");		
	}

}
