package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
class smo{
	static int x;
	void display(){
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the variable");
		x=sc.nextInt();
		System.out.println("class variable:"+x);
		}
		
	}

public class classvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smo s=new smo();
		s.display();
	}

}
