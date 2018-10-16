package LearnSpring;

public class UDisk implements USB{

	@Override
	public void read() {
		System.out.println("read by UDisk");		
	}

	@Override
	public void write() {
		System.out.println("write by UDisk");		
	}

}
