package com.dynamic_IP_calculator.logic;

public class CoreLogic {

	public static void simpleCalcApp(double num1, double num2, int action) {

		double Result;

		//switch case
		
		switch (action) {
		case 1:
			Result = num1 + num2;
			System.out.println("your result is " + Result);
			break;
		case 2:
			Result = num1 - num2;
			System.out.println("your result is " + Result);
			break;
		case 3:
			Result = num1 * num2;
			System.out.println("your result is " + Result);
			break;
		case 4:
			Result = num1 / num2;
			System.out.println("your result is " + Result);
			break;
		case 5:
			Result = num1 % num2;
			System.out.println("your result is " + Result);
			break;
			default :
				System.out.println("you have selected invalid option");

		}
		
		// else if ladder

		/*
		 * if(action.equalsIgnoreCase("add")) { Result = num1 +num2;
		 * System.out.println("your result is "+Result);
		 * 
		 * } else if(action.equalsIgnoreCase("sub")){ Result = num1- num2;
		 * System.out.println("your result is "+ Result); } else
		 * if(action.equalsIgnoreCase("mult")){ Result = num1*num2;
		 * System.out.println("your result is "+ Result); } else
		 * if(action.equalsIgnoreCase("div")){ Result = num1/num2;
		 * System.out.println("your result is "+ Result); } else
		 * if(action.equalsIgnoreCase("mod")){ Result = num1%num2;
		 * System.out.println("your result is "+ Result); } else {
		 * System.out.println("invalid input, please try with available options"); }
		 */

	}
}
