package com.java.eight;

@FunctionalInterface
interface A{
	void show();
	// n number of methods that belongs to Object can we wrapped inside the FI.
	String toString();
}

// We dont want separate classes for each FI, so removing this below class.
/*
 * class B implements A{
 * 
 * public void show() { System.out.println("show"); }
 * 
 * }
 */

public class Lambda {

	public static void main(String[] args) {
		//Anonymous Inner class
		
//		A obj = new A() {
//			public void show() {
//				System.out.println("show");
//			}
//		};
		
		//Lambda Expression  
		A obj = () -> System.out.println("show");
		obj.show();

	}

}
