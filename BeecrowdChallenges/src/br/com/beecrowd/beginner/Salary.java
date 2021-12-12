package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		int employeeNumber = 0;
		int workedHours = 0;
		double amountPerHour = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		employeeNumber = scanner.nextInt();
		workedHours = scanner.nextInt();
		amountPerHour = scanner.nextDouble();
		
		double salary = workedHours * amountPerHour;
		
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		System.out.println("NUMBER = " + employeeNumber + "\nSALARY = U$ " + dec.format(salary));

	}

}
