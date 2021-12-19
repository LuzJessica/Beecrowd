package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.000");
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		double triangleRetangleArea = (a * c)/2;
		double radiusCircleArea = 3.14159 * Math.pow(c, 2);
		double trapeziumArea = ((a+b)*c)/2;
		double squareArea = Math.pow(b, 2);
		double retangleArea = a * b;
		
		System.out.println("TRIANGULO: " + dec.format(triangleRetangleArea) +
				"\nCIRCULO: " + dec.format(radiusCircleArea) +
				"\nTRAPEZIO: " + dec.format(trapeziumArea) +
				"\nQUADRADO: " + dec.format(squareArea) + 
				"\nRETANGULO: " + dec.format(retangleArea));

	}

}
