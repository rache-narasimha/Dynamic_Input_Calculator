package com.dynamic_IP_calculator.logic;
import com.dynamic_IP_calculator.main.*;
import java.util.*;

public class CoreLogic {
	//static Scanner sc = new Scanner (System.in);
	
	//static //double num1;
	//double num2;
	//double Result;
	//String action ;	

	public static void simpleCalcApp(double num1 , double num2 , String action){
		
		/*double add =num1+num2;
		double sub= num1-num2;
		double mult=num1*num2;
		double div = num1/num2;
		double mod = num1%num2;*/
		
		
		// CoreLogic action =new CoreLogic();
		 
			
		
		    
		//	action = sc.next();
		//String action ="add";
		 
		double  Result ;
		 
		 if(action=="add") {
			 Result = num1 +num2;	
			 System.out.println("your result is "+Result);
			 
		 }
		 else if(action=="sub"){
			 Result = num1- num2;
			 System.out.println("your result is "+ Result);
		 }
		 else if(action=="mult"){
			 Result = num1*num2;
			 System.out.println("your result is "+ Result);
		 }
		 else if(action=="div"){
			 Result = num1/num2;
			 System.out.println("your result is "+ Result);
		 }
		 else if(action=="mod"){
			 Result = num1%num2;
			 System.out.println("your result is "+ Result);
		 }
		 else {
			 System.out.println("invalid input, please try with available options");
		 }
	
		
		
	}
}
