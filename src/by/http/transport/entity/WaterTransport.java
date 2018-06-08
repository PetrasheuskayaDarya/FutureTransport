package by.http.transport.entity;

public class WaterTransport extends Transport {
	public String fleetness;
	
	public WaterTransport() {
		
	}
	
	public WaterTransport(int price, int speed, String fleetness) {
		super(price, speed);
		this.fleetness = fleetness;
	}

	public String getFleetness() {
		return fleetness;
	}

	public void setFleetness(String fleetness) {
		this.fleetness = fleetness;
	}

	@Override
	public String toString() {
		return "WaterTransport fleetness=" + fleetness + super.toString();
	}
	
	

}
