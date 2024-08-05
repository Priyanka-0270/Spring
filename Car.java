package com.example.demo;

public class Car {
	private Engine engine;
       // Constructor Injection
		public Car(Engine engine) {
		        this.engine = engine;
		    }
		    public void start() {
		        engine.start();
		    }
		}
	


