package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
        int type;
        type=disp();
        if(type==1)
        {
        	BasicCalc3 calc= new BasicCalc3();

        	calc.menu();
        	calc.userInputs();
        	calc.performOperation();
        }
        if(type==2)
        {
        	ScientificCalc scalc= new ScientificCalc();

        	scalc.menu();
        	scalc.userInputs();
        	scalc.performOperation();	
       	}
        	
        	if(type==3)
        	{
        		StatisticCalc scalc= new StatisticCalc();

        		scalc.menu();
        		scalc.userInputs();
        		scalc.performOperation();
        	}
 
    }
        
    static int disp()
    {
    	int ch;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("======CALUCATOR===========");
		System.out.println("1.BASIC CALCULATOR");
		System.out.println("2.SCIENTIFIC CALCULATOR");
		System.out.println("3.STATISTIC CALCULATOR");
		System.out.println("***************************");
		System.out.println("Enter your choice: ");
    	ch=sc.nextInt();
    	
    return(ch);
    	
    	
    }
}