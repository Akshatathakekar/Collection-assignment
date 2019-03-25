package com.capgemini.model;

import java.util.Objects;

public class Television{

	private String company;
	private String type;
	private boolean threeDEnabled;
	private double price;
	private int result;
	
	public Television(String company, String type, boolean threeDEnabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(company,price,type);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (!(obj instanceof Television))
			return false;
		Television television = (Television) obj;
		if (this.company == television.company && this.price == television.price
				&& this.type==television.type)
			return true;
		

		return false;
	}

	
}
