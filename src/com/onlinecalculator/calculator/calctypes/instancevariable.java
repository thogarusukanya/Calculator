package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
class mno {
int x;
void display(){
int x;
Scanner sc=new Scanner(System.in);
System.out.println("enter the variable");
x=sc.nextInt();
System.out.println("instance variable:"+x);
}
}
public class instancevariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mno s=new mno();
		s.display();
	}

}
