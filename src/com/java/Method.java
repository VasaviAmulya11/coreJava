package com.java;

public class Method {
	static void method1() {
		System.out.println("method1 is executing");
	}
	static void method2() {
		System.out.println("method2 is executing");
	}

	 void method3() {
		System.out.println("method3 is executing");
	}
      void method4() {
	 System.out.println("method4 is executing");
 }
	public static void main(String[] args) {
		Method m1=new Method();
		method1();
		method2();
		m1.method3();
		m1.method4();
	
		

	}

}
