package br.com.beecrowd.beginner;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		int a=0, b=0;
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();

		if( a%b == 0 || b%a==0) {
			System.out.println("Sao Multiplos");
		}else System.out.println("Nao sao Multiplos");
	}

}
