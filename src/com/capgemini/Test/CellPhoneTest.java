package com.capgemini.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.CellPhone;

public class CellPhoneTest {

	CellPhone nokia;
	CellPhone samsung;
	CellPhone redmi;
	CellPhone mi;
	
	@Before
	public void setUp()
	{
		nokia=new CellPhone("Nikia","1222","fffff","Android",15000);
		samsung=new CellPhone("samsung", "382473", "wwwww", "Android", 16600);
		redmi=new CellPhone("xiaomi", "649353","gdjsgb","Android",13000);
		mi=new CellPhone("xiaomi", "649353","gdjsgb","Android",13000);
	}
	

	@Test
	public void testValuesWithHashSet()
	{
		HashSet<CellPhone> cphone=new HashSet<CellPhone>();
		cphone.add(nokia);
		cphone.add(samsung);
		cphone.add(redmi);
		cphone.add(mi);
		System.out.println(cphone.size());
		assertEquals(3, cphone.size());
	}
	
}
