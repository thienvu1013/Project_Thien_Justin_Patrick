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
	
	public static void main(String[] args) {
		double test1 = 180;
		double test2 = 250;
		Converter c = new Converter();
		System.out.println("Test1: " + c.celsiusToFahrenheit(test1));
		System.out.println("Test2: " + c.fahrenheitToCelsius(test2));
	}
}