package by.http.transport.entity;

public class AirTransport extends Transport {
	public int comfort;
	
	public AirTransport() {
		
	}
	public AirTransport(int price, int speed, int comfort) {
		super (price, speed);
		this.comfort = comfort;
	}
	public int getComfort() {
		return comfort;
	}
	public void setComfort(int comfort) {
		this.comfort = comfort;
	}
	@Override
	public String toString() {
		return "AirTransport comfort=" + comfort + super.toString();
	}

}
