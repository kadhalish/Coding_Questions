package com.java.eight;

class Foo{
//	abstract void m();
	static String text = "Foo";
}

class Bar extends Foo{
	void printText() {
		System.out.println(Foo.text);
	}
}
public class JavaTest{

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		String s3 = s1.intern();
		System.out.println(s2==s3);
	}

}
