package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class bitwiseOerators {
	boolean a,b;
	void dynamicInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextBoolean();
		System.out.println("enter the second number");
		b=sc.nextBoolean();
}
	void display(){
		System.out.println("a&b" +(a&b));
		System.out.println("a|b"+(a|b));
		System.out.println("(a^b)"+!(a^b));
	}
	public static void main(String args[]){
		bitwiseOerators s=new bitwiseOerators();
	s.dynamicInput();
	s.display();
	}
	}

