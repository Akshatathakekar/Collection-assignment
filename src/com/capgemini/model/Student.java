package com.capgemini.model;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private String name;
	private String city;
	private String schoolDistrict;
	private String greatSchoolRanking;
	private int rollNo;
	private int result;
	
	public Student(int rollNo,String name, String city, String schoolDistrict, String greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
		this.rollNo=rollNo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,city,schoolDistrict,rollNo);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (!(obj instanceof Student))
			return false;
		Student s = (Student) obj;
		if (this.name ==s.name && this.city == s.city
				&& this.schoolDistrict==s.schoolDistrict && this.rollNo==s.rollNo)
			return true;
		

		return false;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		int result=this.name.compareTo(o.name);
		if(result==0)
		{
			result=Integer.compare(this.rollNo, o.rollNo);
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + ", rollNo=" + rollNo ;
	}



	
}
