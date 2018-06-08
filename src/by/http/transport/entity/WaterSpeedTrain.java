package by.http.transport.entity;

public class WaterSpeedTrain extends WaterTransport {
	public String silence;
	
	public WaterSpeedTrain() {
		
	}
	public WaterSpeedTrain(int price, int speed, String fleetness, String silence) {
		super(price, speed, fleetness);
		this.silence = silence;
	}
	public String getSilence() {
		return silence;
	}
	public void setSilence(String silence) {
		this.silence = silence;
	}
	@Override
	public String toString() {
		return "WaterSpeedTrain silence=" + silence + super.toString();

}
}
