package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryWithBonus {

	public static void main(String[] args) {
		
		String sellersName = "";
		double salary = 0.0;
		double salesTotal = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		sellersName = scanner.next();
		salary = scanner.nextDouble();
		salesTotal = scanner.nextDouble();
		
		double finalSalary = salary + (salesTotal * 0.15);
		
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		System.out.println("TOTAL = R$ " + dec.format(finalSalary));

	}

}
