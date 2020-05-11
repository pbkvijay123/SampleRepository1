package com.p1;

public class MainApp {

	public static void main(String[] args) 
	{
	  Employee eobj= new Employee();
	  eobj.setEid(101);
	  eobj.setEsal(25000.00);
	  eobj.setEname("Vijay");
	  System.out.println(eobj.getEid()+"  "+eobj.getEname());
	}
}