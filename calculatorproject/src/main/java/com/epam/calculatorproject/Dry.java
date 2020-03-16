package com.epam.calculatorproject;

import java.util.Scanner;

public class Dry {
	
	public static double addition(double a,double b) {
		return a+b;
	}
	public static double subtraction(double a, double b) {
		return addition(a,-b);
	}
	public static double multiplication(double a, double b) {
		double sum = 0.0;
		for(int i = 0; i < b; i++)
			sum = addition(sum,a);
		return sum;
	}
	public static double division(double a, double b) {
		double result = a;
		while(a >= b) {
			result++;
		    addition(result,-b);
		}
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
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
