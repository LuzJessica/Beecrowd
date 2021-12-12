package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculate {

	public static void main(String[] args) {

		int productCode = 0;
		int numberOfUnits = 0;
		double productPrice = 0.0;
		double valueToPay = 0.0;

		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.00");


		int lines = 2;
		while (lines != 0) {
			
			productCode = scanner.nextInt();
			numberOfUnits = scanner.nextInt();
			productPrice = scanner.nextDouble();
			
			valueToPay += numberOfUnits * productPrice;
			lines --;

		}
		
		System.out.println("VALOR A PAGAR: R$ " + dec.format(valueToPay));

	}

}
