package by.http.transport.entity;

public class GroundSuperBoat extends GroundTransport {
	public String visibility;
	
	public GroundSuperBoat() {
		
	}
	public GroundSuperBoat(int price, int speed, int weight, String visibility) {
		super(price, speed, weight);
		this.visibility = visibility;
		
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	@Override
	public String toString() {
		return "GroundSuperBoat visibility=" + visibility + super.toString();
	}

}
