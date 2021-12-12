package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		
		double r = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0.000");
		
		r = scanner.nextDouble();
		
		double sphereVolumn = (4.0/3.0) * 3.14159 * Math.pow(r, 3);
		
		System.out.println("VOLUME = " + dec.format(sphereVolumn));

	}

}
