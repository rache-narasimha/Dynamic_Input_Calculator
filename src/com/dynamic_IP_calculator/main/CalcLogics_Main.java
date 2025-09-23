package com.dynamic_IP_calculator.main;

import java.util.Scanner;
import com.dynamic_IP_calculator.logic.*;

public class CalcLogics_Main {
//static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome");
		System.out.println("you can perform following actions-");
		System.out.println("for addition, please type '1'");
		System.out.println("for substraction, please type '2'");
		System.out.println("for multiplication, please type '3'");
		System.out.println("for divison, please type '4'");
		System.out.println("for modulus, please type'5'");
		System.out.println("please type the action you want to perform");

		int action;

		Scanner sc = new Scanner(System.in);

		action = sc.nextInt();
if (action>5) {
	System.out.println("you have selected invalid option, please select with in the available options");
}
else if (action<=5 && action >=0){
	

		double num1;
		double num2;

		System.out.println("Enter your 1st Value ");
		num1 = sc.nextDouble();

		System.out.println("Enter your 2nd value");
		num2 = sc.nextDouble();

		sc.close();

		CoreLogic.simpleCalcApp(num1, num2, action);

	}

}
	}
	
