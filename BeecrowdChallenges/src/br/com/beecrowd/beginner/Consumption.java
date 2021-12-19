package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumption {

	public static void main(String[] args) {
		
		int x = 0;
		double y = 0;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.000");
		
		x = scanner.nextInt();
		y = scanner.nextDouble();
		
		double consumption = x/y;
		
		System.out.println(dec.format(consumption) + " km/l");
		
		

	}

}
