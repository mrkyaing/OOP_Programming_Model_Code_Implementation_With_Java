
public class CarDemo {

	public static void main(String[] args) {
	
     Car mycar=new Car();//create my car object 
     mycar.LicenceNo="YGN/33333";
     mycar.StartEngine();//call the StartEngine method
     mycar.PlayHorn();
     System.out.println("============");
     
     Car yourcar=new Car();//create yourcar object.
     yourcar.LicenceNo="NPT/123456";
     yourcar.StartEngine();//call the StartEngine method
     yourcar.StopEngine();//call the StopEngine method
     
     System.out.println("============");
     Car BMW=new Car();
     BMW.LicenceNo="YGN/999999";
     BMW.StartEngine();//call the StartEngine method
     BMW.StopEngine();//call the StopEngine method
     
	}

}
