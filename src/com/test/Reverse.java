package com.test;

public class Reverse {

	public static void main(String[] args) {
		String ip = "Good   luck  for you";
		String [] a = ip.split(" ");
		String op = "";
		for(String i:a) {
			op=op+i.trim()+" ";
		}
		System.out.println(op.trim());
		
	}

}
