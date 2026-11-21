package com.java;

public class Student {
	String Name;
	int Rollno;
	String BatchNo;
	long MobileNo;
	String CollegeName;
	static void Method(){
		Student s=new Student();
		s.Name="Ammu";
		s.Rollno=12237;
		s.MobileNo=658913479;
		s.BatchNo="81";
		s.CollegeName="Vcube";
		s.Method1();
	}
      void Method1() {
    	 System.out.println(Name);
    	 System.out.println(Rollno);
    	 System.out.println(BatchNo);
    	 System.out.println(MobileNo);
    	 System.out.println(CollegeName);
      }
	public static void main(String[] args) {
          Method();
	}

}
