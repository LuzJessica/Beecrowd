package br.com.beecrowd.beginner;

import java.util.Scanner;

public class SimpleSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		int B = 0;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		int SOMA = A+B;
		
		System.out.println("SOMA = "+ SOMA);

	}

}
