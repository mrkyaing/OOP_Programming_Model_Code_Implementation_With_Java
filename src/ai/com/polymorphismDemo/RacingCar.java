package ai.com.polymorphismDemo;

public class RacingCar {
	public String LicenceNo;
	public String Color;
	public int GearNo;
	public RacingCar() {		
	}	
	public RacingCar(String licenceNo, String color, int gearNo) {
		LicenceNo = licenceNo;
		Color = color;
		GearNo = gearNo;
	}
	// define the start engine method
	public void StartEngine() {
		System.out.println(LicenceNo + " is has stated.");
	}

	// define the Stop engine method
	public void StopEngine() {
		System.out.println(LicenceNo + " is has Stop.");
	}	
	public void PlayHorn() {
		System.out.println("Pwann Pwann...");
	}
	//method overload(compile-time polymorphsim)
	public void Drive() {
		System.out.println("Car is driving with " + GearNo);
	}
	public void Drive(int _gerno) {
		GearNo=_gerno;
		System.out.println("GearNo is changing right now.");
		System.out.println("Car is driving with " + GearNo);
	}
	public void UseNitro() {
		System.out.println("Racing Car is used Nitro.");
	}
	
}
