package com.capgemini.model;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class carTest {

	private Car bmw;
	private Car maruti;
	private Car swift;
	TreeSet<Car> car;
	
	@Before
	public void setUp()
	{
		swift=new Car("qqr","3333",1999,600000);
		maruti=new Car("abc","1111",2001,500000);
		bmw=new Car("abc","1111",2000,3500000);
		

		car=new TreeSet<>();
		
		car.add(maruti);
		car.add(swift);
		car.add(bmw);
		
	}

	@Test
	public void testCarWithDifferentValue()
	{
		System.out.println(car.size());
		assertEquals(-16, bmw.compareTo(swift));

	}


	@Test
	public void testCarWithValue()
	{
		
		assertEquals(16, swift.compareTo(bmw));

	}
	
	@Test
	public void testOrder()
	{
		Iterator<Car> it=car.iterator();
        assertEquals(bmw,it.next());
		
	}
	
}
