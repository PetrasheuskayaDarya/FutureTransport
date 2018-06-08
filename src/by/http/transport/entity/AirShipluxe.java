package by.http.transport.entity;

public class AirShipluxe extends AirTransport {
	public int shipLength;
	
	public AirShipluxe() {
		
	}
	
	public AirShipluxe(int price, int speed, int comfort, int shipLength) {
		super(price, speed, comfort);
		this.shipLength = shipLength;
	}

	public int getShipLength() {
		return shipLength;
	}

	public void setShipLength(int shipLength) {
		this.shipLength = shipLength;
	}

	@Override
	public String toString() {
		return "AirShipluxe shipLength=" + shipLength + super.toString();
	}
	

}
