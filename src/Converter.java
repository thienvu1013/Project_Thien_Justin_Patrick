// This is the development branch.
public class Converter {
	//Your names go here:
	/*
	* @Author: Thien Nguyen
	* Justin Leong
	* Patrick Linang
	*
	*/
	private double celsiusToFahrenheit(double C){
		return 9.0/5.0 * C + 32;
	}
	
	private double fahrenheitToCelsius(double F){
		return (5.0 * (F - 32.0) / 9.0);
	}
	
	private double kilometersToMiles(double km){
		return km / 1.609344;
	}
	
	public static void main(String[] args) {
		double test1 = 180;
		double test2 = 250;
		double test3 = 30;
		Converter c = new Converter();
		System.out.println("Test1: " + c.celsiusToFahrenheit(test1));
		System.out.println("Test2: " + c.fahrenheitToCelsius(test2));
		System.out.println("Test3: " + c.kilometersToMiles(test3));
	}
}