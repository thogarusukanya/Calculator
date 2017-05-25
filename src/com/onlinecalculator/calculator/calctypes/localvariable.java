package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
class sno {
void display(){
int x;
Scanner sc=new Scanner(System.in);
System.out.println("enter the variable");
x=sc.nextInt();
System.out.println("local variable:"+x);
}
}
public class localvariable{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		sno l=new sno();
l.display();
	}
}



