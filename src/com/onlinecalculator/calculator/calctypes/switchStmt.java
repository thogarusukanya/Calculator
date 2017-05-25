package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class switchStmt {
	int a,b,choice;
	void dynamicInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("enter your choice");
		choice=sc.nextInt();
	}
	void display()
	{
		switch(choice){
		
		if(choice==1)
			System.out.println(a+b);
		else if(choice==2)
			System.out.println(a-b);
		else if(choice==3)
			System.out.println(a*b);
		else if(choice==4)
			System.out.println(a/b);
		else if(choice==5)
			System.out.println("bye");
		System.exit(0);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
switchStmt s=new switchStmt();
s.dynamicInput();
s.display();
	}

}
