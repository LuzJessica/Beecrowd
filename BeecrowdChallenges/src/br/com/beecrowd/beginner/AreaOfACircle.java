package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double R = 0;
		R = scanner.nextDouble();
		
		double n = 3.14159;
		double A = (n*(Math.pow(R, 2)));
		DecimalFormat dec = new DecimalFormat("#0.0000");
		System.out.println("A="+dec.format(A));
	}

}
