package br.com.beecrowd.beginner;

import java.util.Scanner;

public class Banknotes {

	public static void main(String[] args) {
		
		int value = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		int notesOf100 = 0;
		int notesOf50 = 0;
		int notesOf20 = 0;
		int notesOf10 = 0;
		int notesOf5 = 0;
		int notesOf2 = 0;
		int notesOf1 = 0;
		int aux = 0;
		
		value = scanner.nextInt();
		
		notesOf100 = value/100;
		aux = value%100;
		notesOf50 = aux/50;
		aux = aux%50;
		notesOf20 = aux/20;
		aux = aux%20;
		notesOf10 = aux/10;
		aux = aux%10;
		notesOf5 = aux/5;
		aux = aux%5;
		notesOf2 = aux/2;
		aux = aux%2;
		notesOf1 = aux/1;
		aux = aux%1;
		
		System.out.println(value+
				"\n" + notesOf100 + " nota(s) de R$ 100,00"+
				"\n" + notesOf50 + " nota(s) de R$ 50,00"+
				"\n" + notesOf20 + " nota(s) de R$ 20,00"+
				"\n" + notesOf10 + " nota(s) de R$ 10,00"+
				"\n" + notesOf5 + " nota(s) de R$ 5,00"+
				"\n" + notesOf2 + " nota(s) de R$ 2,00"+
				"\n" + notesOf1 + " nota(s) de R$ 1,00");
		
	}

}
