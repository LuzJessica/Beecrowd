package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {
		
		int productCode=0, quantity=0;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		productCode = scanner.nextInt();
		quantity = scanner.nextInt();
		
		if(productCode == 1) {
			System.out.println("Total: R$ " + dec.format(quantity* 4));
		}else if(productCode == 2) {
			System.out.println("Total: R$ " + dec.format(quantity* 4.50));
		}else if(productCode == 3) {
			System.out.println("Total: R$ " + dec.format(quantity* 5));
		}else if(productCode == 4) {
			System.out.println("Total: R$ " + dec.format(quantity* 2));
		}else if(productCode == 5) {
			System.out.println("Total: R$ " + dec.format(quantity* 1.5));
		}
	}

}
