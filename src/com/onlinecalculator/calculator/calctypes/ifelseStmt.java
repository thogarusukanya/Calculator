package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class ifelseStmt {
	int a,b;
	void dynamicInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
}
	void display(){
		if(a>b)
		System.out.println("a is big");	
		else
		System.out.println("b is big");	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifelseStmt s=new ifelseStmt();
		s.dynamicInput();
		s.display();
	}

}
