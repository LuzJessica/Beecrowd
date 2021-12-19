package br.com.beecrowd.beginner;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		int distante = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		distante = scanner.nextInt();
		
		int minutes = 2 * distante;
		
		System.out.println(minutes + " minutos");

	}

}
