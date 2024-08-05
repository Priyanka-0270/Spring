package com.example.demo;

public class Dummy {
	public static void main(String[] args) {
        Engine engine = new DieselEngine();
        Car car = new Car(engine);
        car.start();

	}

}
