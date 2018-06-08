package by.http.transport.entity;

import java.util.Arrays;

public class Transport extends FutureTransport {
	public int price;
	public int speed;
   
	
	public Transport() {
		
	}
	
	public Transport(int price, int speed) {
		this.price = price;
		this.speed = speed;
	}
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Transport [price=" + price + ", speed=" + speed + "]";
	}


	
}
