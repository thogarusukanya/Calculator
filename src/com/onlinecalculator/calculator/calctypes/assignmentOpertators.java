package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class assignmentOpertators {
	int a,b;
	void dynamicInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
}
	void display(){
		System.out.println("adition" +(a+=b));
		System.out.println("substraction"+(a-=b));
		System.out.println("multiplication"+(a*=b));
		System.out.println("division"+(a/=b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignmentOpertators s=new assignmentOpertators();
		s.dynamicInput();
		s.display();
	}

}
