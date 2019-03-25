package com.capgemini.model;

import java.util.Objects;

public class CellPhone {

	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;

	public CellPhone(String company, String model, String description, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, model, operatingSystem);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (!(obj instanceof CellPhone))
			return false;
		CellPhone cphone = (CellPhone) obj;
		if (this.company == cphone.company && this.model == cphone.model
				&& this.operatingSystem == cphone.operatingSystem)
			return true;
		else

			return false;
	}

}
