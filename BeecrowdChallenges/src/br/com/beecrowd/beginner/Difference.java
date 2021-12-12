package br.com.beecrowd.beginner;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		D = scanner.nextInt();
		
		int difference = (A*B)-(C*D);
		
		System.out.println("DIFERENCA = " + difference);
		

	}

}
