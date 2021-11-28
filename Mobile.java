package week1.day1;

public class Mobile {
String mobileModel = "Redmi Note 4";
int mobileWeight = 800;
boolean fullCharge = true;
double mobileCost = 15349.23;


	public void makeCall() {
		System.out.println("call Raj");
	}
	public void sendMsg() {
		System.out.println("Hi Raj");
	}
	public static void main(String[] args) {
		Mobile android = new Mobile();

		android.makeCall();
		android.sendMsg();
		
		System.out.println(android.mobileModel);
		System.out.println(android.mobileWeight);
		System.out.println(android.mobileCost);
		System.out.println(android.fullCharge);
		
	}
	
}
