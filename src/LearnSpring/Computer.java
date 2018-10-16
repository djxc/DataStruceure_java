package LearnSpring;

public class Computer implements USB{
	private USB usb;

	public USB getUsb() {
		return usb;
	}

	public void setUsb(USB usb) {
		this.usb = usb;
	}

	@Override
	public void read() {
		this.usb.read();		
	}

	@Override
	public void write() {
		this.usb.write();
	}
	
	
	
}
