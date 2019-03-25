package com.capgemini.model;

import java.util.Objects;

public class Laptop {

	private String company;
	private String model;
    private String operatingSystem;
    private String processor;
    
    @Override
    public int hashCode()
    {
		return Objects.hash(company,model);
    }
  
    public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	

	public boolean equals(Object obj)
    {
    	if(obj==null)
    		return false;
    	else if(this==obj)
    		return true;
    	else if(!(obj instanceof Laptop))
    		return false;
    	Laptop l=(Laptop)obj;
    	if(this.company==l.company && this.model==l.model )
    		return true;
    	
		return false;
    }
  
}
