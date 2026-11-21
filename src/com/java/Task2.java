package com.java;

public class Task2 {
	static void task1() {
		System.out.println("Method1 is executing");
	}
	static void task2() {
		System.out.println("Method2 is executing");
	}
	void task3() {
		System.out.println("Method3 is executing");
	}
	void task4() {
		task1();
		System.out.println("method4 is executing");
	}

	public static void main(String[] args) {
	
	}
	static {
		task1();
		task2();
		Task2 t=new Task2();
		t.task3();
		t.task4();
	}

}
