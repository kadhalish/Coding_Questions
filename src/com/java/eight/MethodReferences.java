package com.java.eight;

@FunctionalInterface
interface I{
	void shout();
}

public class MethodReferences {

	public static void main(String[] args) {
		// NOTE : Method signature of the methods 'shout' should be same.
		I obj = new MethodReferences() :: shout;
		obj.shout();
	}

	public void shout() {
		System.out.println("Shouting");
	}
	
}
