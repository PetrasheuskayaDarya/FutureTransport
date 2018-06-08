package by.http.transport.entity;

public class AirShipRound extends AirTransport {
	public int capacity;
	
	public AirShipRound() {
		
	}
	public AirShipRound(int price, int speed, int comfort, int capacity) {
		super(price, speed, comfort);
		this.capacity = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "AirShipRound capacity=" + capacity + super.toString();
	}

}
