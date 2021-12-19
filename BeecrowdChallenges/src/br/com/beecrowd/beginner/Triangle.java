package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		double a=0, b=0, c=0;

		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("#0.0");
		
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		double perimeter = 0;
		double area = 0;

		if((a > Math.abs(b-c) && a< b+c) || 
				(b > Math.abs(a-c) && b<a+c) || 
					(c > Math.abs(a-b) && c<a+b)){

			perimeter = a+b+c;
			System.out.println("Perimetro: " + dc.format(perimeter));

		}else {
			
			area = ((a+b)*c)/2;
			System.out.println("Area: " + dc.format(area));
		}	
	}

}
