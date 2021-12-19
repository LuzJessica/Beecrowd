package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BhaskarasFormula {

	public static void main(String[] args) {
		
		double a=0.0, b=0.0, c=0.0;
		double r1=0.0;
		double r2=0.0;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		c=scanner.nextDouble();
		
		double delta = Math.pow(b, 2) - (4*a*c);

		
		if(a==0 || delta<=0) {
			System.out.println("Impossivel calcular");
		}else {
			r1 = (-b + Math.sqrt(delta))/(2*a);
			r2 = (-b - Math.sqrt(delta))/(2*a);
			
			System.out.println("R1 = " + dec.format(r1) +
					"\nR2 = " + dec.format(r2));
		}
	}

}
