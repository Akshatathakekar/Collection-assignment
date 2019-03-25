package com.capgemini.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Student;


public class StudentTest {

	private Student student1;
	private Student student2;
	private Student student3;
	private Student student4;
	private Student student5;
	ArrayList<Student> student;
	HashMap<String, String> hmap;

	@Before
	public void setUp() {
		student1 = new Student(11, "John", "pen", "Raigarth", "A");
		student2 = new Student(13, "Anna", "panvel", "mumbai", "B");
		student3 = new Student(12, "Alex", "dadar", "mumbai", "A");
		student4 = new Student(13, "Anna", "panvel", "mumbai", "B");
		student5 = new Student(14, "John", "nerul", "Navi Mumbai", "C");
		student = new ArrayList<Student>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		
		hmap = new HashMap<String, String>();
		hmap.put(student1.getName(), "Apple");
		hmap.put(student2.getName(), "mango");
		hmap.put(student3.getName(), "bannana");

	}

	@Test
	public void testInsertionOrder() {
		Iterator it = student.iterator();
		assertEquals(student1, it.next());

	}

	@Test
	public void testOrder() {
		TreeSet<Student> stud = new TreeSet<Student>();
		stud.add(student1);
		stud.add(student2);
		stud.add(student3);
		stud.add(student4);
		stud.add(student5);

		}

	@Test
	public void testWithHashMap() {
		
		assertEquals("Apple",hmap.get(student1.getName()));
		assertEquals("mango",hmap.get(student2.getName()));
		assertEquals("bannana",hmap.get(student3.getName()));

	}
	
	@Test
	public void testWithKeys()
	{
		
		for(String key:hmap.keySet())
		{
			System.out.println(key);
		}		

		for(String key:hmap.values())
		{
			System.out.println(key);
		}
		
	}
	
}
