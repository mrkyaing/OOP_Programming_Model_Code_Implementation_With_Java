package ai.com.polymorphismDemo;

public class CarDemo {

	public static void main(String[] args) {
	
AutoRacingCar auto=new AutoRacingCar();
auto.LicenceNo="YGN/123456";
auto.Color="Red";
auto.GearNo=4;
auto.StartEngine();
auto.StopEngine();
auto.PlayHorn();
auto.Drive();
auto.Drive(6);
	}

}
