package by.http.transport.entity;

public class GroundTransport extends Transport {
	public int weight;
	
	public GroundTransport() {
		
	}
	public GroundTransport(int price, int speed, int weight) {
		super(price, speed);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "GroundTransport weight=" + weight + super.toString();
	}

}
