package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		
		double x1 = 0;
		double x2 = 0;
		double y1 = 0;
		double y2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.0000");
		
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
			
		double sqrt = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
				
		System.out.println(dec.format(sqrt));

	}

}
