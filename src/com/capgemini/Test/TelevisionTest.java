package com.capgemini.Test;


import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Television;

public class TelevisionTest {

	private Television sony;
	private Television LG;
	private Television samsung;
	private Television samsungTV;
	
	@Before
	public void setUp()
	{
		sony=new Television("sony","LED", true,20000 );
		samsung=new Television("samsung","LCD", true, 30000);
		samsungTV=new Television("samsung","LCD", true, 30000);
		LG=new Television("LG","LED", true,50000 );
	
	}
	
	@Test
	public void testValuesWithHashSet()
	{
		HashSet<Television> television=new HashSet<Television>();
		television.add(sony);
		television.add(samsung);
		television.add(LG);
		television.add(samsungTV);
		System.out.println(television.size());
		assertEquals(3, television.size());
	}
	
	
	
}
