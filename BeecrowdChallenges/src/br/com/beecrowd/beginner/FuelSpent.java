package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelSpent {

	public static void main(String[] args) {
		
		int spentTime = 0;
		int averageSpeed = 0;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.000");
		
		spentTime = scanner.nextInt();
		averageSpeed = scanner.nextInt();
		
		double liters = (spentTime*averageSpeed)/12.0;
		
		System.out.println(dec.format(liters));

	}

}
