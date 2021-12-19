package br.com.beecrowd.beginner;

import java.util.Scanner;

public class TheGreatest {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		int greatestBetweenAB = (a+b+Math.abs(a-b))/2;
		int greatestBetweenResultAndC = (greatestBetweenAB + c + Math.abs(greatestBetweenAB-c))/2;
		
		System.out.println(greatestBetweenResultAndC + " eh o maior");

	}

}
