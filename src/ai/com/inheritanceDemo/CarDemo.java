package ai.com.inheritanceDemo;
public class CarDemo {
	public static void main(String[] args) {
		RacingCar mycar=new RacingCar();
		mycar.LicenceNo="YGN/123456";
		mycar.GearNo=4;
		mycar.Color="Black";
		mycar.StartEngine();
		mycar.StopEngine();
		mycar.PlayHorn();
		mycar.Drive();
		mycar.showRacingCarStatus();
		System.out.println("=========");
		
		TrackCar mytrackCar=new TrackCar();
		mytrackCar.LicenceNo="MDY/123456";
		mytrackCar.GearNo=1;
		mytrackCar.Color="White";
		mytrackCar.StartEngine();
		mytrackCar.StopEngine();
		mytrackCar.PlayHorn();
		mytrackCar.Drive();
		mytrackCar.showTrackCarStatus();		
		
       System.out.println("=========");
		
		AirConTruckCar myAirConTruckCar=new AirConTruckCar();
		myAirConTruckCar.LicenceNo="NPT/123456";
		myAirConTruckCar.GearNo=2;
		myAirConTruckCar.Color="Red";
		myAirConTruckCar.StartEngine();
		myAirConTruckCar.StopEngine();
		myAirConTruckCar.PlayHorn();
		myAirConTruckCar.Drive();
		mytrackCar.showTrackCarStatus();
	}

}
