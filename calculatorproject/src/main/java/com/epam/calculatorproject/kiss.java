package com.epam.calculatorproject;

import java.util.Scanner;

public class kiss {
	public static double operation(double a, int op, double b){
		double d[] = {a+b,a-b,a*b,a/b};
		return d[op-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
    	double a = s.nextDouble();
    	double b = s.nextDouble();
    	int op = s.nextInt();
    	System.out.println(operation(a,op,b));

	}

}
