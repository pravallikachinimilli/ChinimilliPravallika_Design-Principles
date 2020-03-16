package com.epam.calculatorproject;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static double addition(double a, double b) {
		return a+b;
	}
	
	public static double subtraction(double a, double b) {
		return a-b;
	}
    
	public static double multiplication(double a, double b) {
		return a*b;
	}
    
	public static double division(double a, double b) {
		return a/b;
	}
    
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
    	double a = s.nextDouble();
    	double b = s.nextDouble();
    	char op = s.next().charAt(0);
    	switch(op) {
    	case '+' :	System.out.println(addition(a,b));
    			    break;
    	case '-' : System.out.println(subtraction(a,b));
    			   break;
    	case '*' : System.out.println(multiplication(a,b));
		           break;
    	case '/' : System.out.println(division(a,b));
		           break;
		default :System.out.println("INVALID OPERATOR");

    	}
    }

}
