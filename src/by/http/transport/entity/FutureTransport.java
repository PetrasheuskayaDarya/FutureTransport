package by.http.transport.entity;

public class FutureTransport {

	FutureTransport[] transport = new FutureTransport[9];
	Transport future = new Transport();
	
	WaterTransport w1Transport = new WaterSpeedTrain (10,100,"fleetness","silence");
	WaterTransport w2Transport = new WaterSpeedTrain (10,80,"fleetness","silence");
	WaterTransport w3Transport = new WaterSpeedTrain (10,90,"fleetness","silence");
	GroundTransport g1Transport = new GroundSuperBoat(15,90,1000, "visible");
	GroundTransport g2Transport = new GroundSuperBoat(20,90,10000, "visible");
	GroundTransport g3Transport = new GroundSuperBoat(30,60,10000, "visible");
	AirTransport a1Transport = new AirShip (20, 60, 8, "red");
	AirTransport a2Transport = new AirShipluxe(20, 50, 8, 100);
	AirTransport a3Transport =  new AirShipRound(30,20,10,10);
	{
		
	transport[0] = w1Transport;
	transport[1] = w2Transport;
	transport[2] = w3Transport;
	transport[3] = g1Transport;
	transport[4] = g2Transport;
	transport[5] = g3Transport;
	transport[6] = a1Transport;
	transport[7] = a2Transport;
	transport[8] = a3Transport;
	
	
	future.setTransport(transport);
	}
	
	public void priceOfTransport() {
		int j = 0;
		for (int i = 0; i < transport.length; i++) {
			j += transport[i].getPrice();
		}
		System.out.println(j + "$");
	}


	public void showTransport() {
		for (int i = 0; i < transport.length; i++) {
			System.out.print(transport[i] + "\n");
		}
		System.out.println();
	}
	

public FutureTransport[] getTransport() {
	return transport;
}


public void setTransport(FutureTransport[] transport) {
	this.transport = transport;
}



}
