package com.dynamic_IP_calculator.main;

import java.util.Scanner;
import com.dynamic_IP_calculator.logic.*;
import com.dynamic_IP_calculator.logic.*;

public class CalcLogics_Main {
static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		System.out.println("Welcome");
		System.out.println("you can perform following actions-");
		System.out.println("1)add");
		System.out.println("2)sub");
		System.out.println("3)mult");
		System.out.println("4)div");
		System.out.println("5)mod");
		System.out.println("please type the action you want to perform");
 
		String action ;
			
			
		    
			action = sc.next();
	   	    
		double num1;
		double num2;

	//	num1 =sc.nextDouble();
	//	num2 =sc.nextDouble();
        
		
		
				
		System.out.println("Enter your 1st Value ");
		 num1 =sc.nextDouble();
		 
		 
		 System.out.println("Enter your 2nd value");
		 num2 =sc.nextDouble();
		 
		 
		
		 CoreLogic.simpleCalcApp( num1 ,  num2 , action);
		
		
		
		
	
		
		/*int sum = num1+num2;
		System.out.println("your sum is = "+sum);*/
		
		

	}

}
