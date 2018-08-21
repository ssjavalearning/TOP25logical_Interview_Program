package com.suraj.structral.pattern.adapter;

/**
 * Adapter design pattern is one of the structural design pattern 
 * and its used so that two unrelated interfaces can work together. 
 * The object that joins these unrelated interface is called an Adapter.
 * 
 * @author suraj singh
 *
 */
interface Vehicle {
	void move();
}

class Bus implements Vehicle {

	@Override
	public void move() {
		System.out.println("bus is moving");
	}
}

class Car implements Vehicle {
	
	@Override
	public void move() {
		System.out.println("car is moving");
	}
}

class Bike {
	public void run() {
		System.out.println("bike is running");
	}
}

class BikeAdapter implements Vehicle {
	Bike bike = new Bike();
	
	@Override
	public void move() {
		bike.run();
	}
}

public class AdapterPatternDemo {

	public static void main(String[] args) {
		vehicleRide(new Bus());
		vehicleRide(new Car());
		vehicleRide(new BikeAdapter());
	}

	public static void vehicleRide(Vehicle vehicle) {
		vehicle.move();
	}
}
