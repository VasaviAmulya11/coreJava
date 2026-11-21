package com.java;

public class Employee {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized is called");
		 Employee e4=new Employee();
	}                              

	public static void main(String[] args) {
		 System.out.println("Main method is started");
		 Employee e1=new Employee();
		 Employee e2=new Employee();
		 Employee e3=new Employee();
		 System.out.println(e1);
		 System.out.println(e2);
		 System.out.println(e3);
		 e3=null;
		 System.gc();
		 System.out.println(e3);
		 e1=e2;
		 System.out.println(e1);
 		 new Employee();
		 System.out.println("Main Method is End");
		 System.gc();
		 
		 

	}

}
