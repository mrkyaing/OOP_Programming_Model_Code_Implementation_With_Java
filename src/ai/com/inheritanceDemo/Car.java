package ai.com.inheritanceDemo;

public class Car {
	public String LicenceNo;
	public String Color;
	public int GearNo;

	public Car() {
		
	}
	
	public Car(String licenceNo, String color, int gearNo) {
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

	public void Drive() {
		System.out.println("Car is driving with" + GearNo);
	}
}
