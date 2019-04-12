package com.mathangi.java.generic;

public class Application {

	public static void main(String[] args) {
		/*Car car = new Car();
		Jeep jeep = new Jeep();
		
		Vehicle<Car> carVehicle = new Vehicle<>(car);
		carVehicle.drive();
		
		Vehicle<Jeep> jeepVehicle = new Vehicle<>(jeep);
		jeepVehicle.drive();*/
		
		PrintArray printArray = new PrintArray();
		Integer array[]= {1,2,3,4,5};
		String arr[]= {"a","e","i"};
		printArray.printArray(array);
		
		

	}

}
