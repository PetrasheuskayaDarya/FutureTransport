package by.http.transport.entity;

public class AirShip extends AirTransport {
	public String color;
	
	public AirShip() {
		
	}
	public AirShip(int price, int speed, int comfort, String color) {
		super(price, speed, comfort);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "AirShip color=" + color + super.toString();
	}
	

}
