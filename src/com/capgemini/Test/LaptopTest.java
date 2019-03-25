package com.capgemini.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Laptop;


public class LaptopTest {

	private Laptop dellLaptop;
	private Laptop hpLaptop;
	private Laptop acerLaptop;
	
	@Before
	public void setUp()
	{
		dellLaptop=new Laptop("dell","54544aa","windows","i3");
		hpLaptop=new Laptop("HP","gdsfj","windows 8","i7");
		acerLaptop=new Laptop("acer","dhjh","ubuntu","i5");
	}
	
	@Test
	public void testLaptopWithArrayList()
	{
		ArrayList<Laptop> laptops=new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);
		System.out.println("size");
		System.out.println(laptops.size());

		Iterator<Laptop> it=laptops.iterator();
         assertEquals(dellLaptop,it.next());
	}

	
	@Test
	public void testLaptopWithHashSet()
	{
		HashSet<Laptop> lap=new HashSet<Laptop>();
		lap.add(dellLaptop);
		lap.add(hpLaptop);
		lap.add(acerLaptop);
		lap.add(dellLaptop);

		System.out.println(lap.size());
		assertEquals(3, lap.size());
		//lap.add(dellLaptop);
	}
	
	
	
	

}
