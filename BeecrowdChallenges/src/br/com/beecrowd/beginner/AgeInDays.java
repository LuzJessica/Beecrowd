package br.com.beecrowd.beginner;

import java.util.Scanner;

public class AgeInDays {

	public static void main(String[] args) {

		int ageInDays = 0;

		Scanner scanner = new Scanner(System.in);

		int years = 0;
		int months = 0;
		int days = 0;
		int aux = 0;

		ageInDays = scanner.nextInt();

		years = ageInDays/365;
		aux = ageInDays%365;
		months = aux/30;
		aux = aux%30;
		days = aux;

		System.out.println(years + " ano(s)" +
				"\n" + months + " mes(es)" +
				"\n" + days + " dia(s)");
	}

}
