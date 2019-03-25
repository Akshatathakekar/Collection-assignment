package com.capgemini.model;

import java.util.Iterator;
import java.util.Objects;

public class Car implements Comparable<Car> {

	private String make;
	private String model;
	private int year;
	private double price;
	private int result;
	

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (!(obj instanceof Laptop))
			return false;
		Car car = (Car) obj;
		if (this.make == car.make && this.model == car.model)
			return true;
		

		return false;
	}

	@Override
	public int compareTo(Car c) {

		result = this.make.compareTo(c.make);
		if(result==0)
		result=this.model.compareTo(c.model);
		return result;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + "]"  +" "+model;
	}

	
}
