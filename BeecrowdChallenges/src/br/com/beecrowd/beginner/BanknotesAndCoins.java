package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BanknotesAndCoins {

	public static void main(String[] args) {
		
		double value = 0;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("#0");
		
		double notesOf100 = 0.0;
		double notesOf50 = 0.0;
		double notesOf20 = 0.0;
		double notesOf10 = 0.0;
		double notesOf5 = 0.0;
		double notesOf2 = 0.0;
		
		double coinOf1 = 0.0;
		double coinOf50 = 0.0;
		double coinOf25 = 0.0;
		double coinOf10 = 0.0;
		double coinOf5 = 0.0;
		double coinOf1cent = 0.0;
		
		double aux = 0.0;
		
		value = scanner.nextDouble();
		
		notesOf100 = value/100;
		aux = value%100;
		notesOf50 = aux/50;
		aux = aux%50;
		notesOf20 = aux/20;
		aux = aux%20;
		notesOf10 = aux/10;
		aux=aux%10;
		notesOf5 = aux/5;
		aux=aux%5;
		notesOf2 = aux/2;
		aux=aux%2;
		coinOf1=aux/1;
		aux=aux%1;
		coinOf50 = aux/0.5;
		aux = aux%0.5;
		coinOf25 = aux/0.25;
		aux = aux%0.25;
		coinOf10 = aux/0.10;
		aux = aux%0.10;
		coinOf5 = aux/0.05;
		aux = aux%0.05;
		coinOf1cent = aux/0.01;
		aux = aux%0.01;
		
		System.out.println("NOTAS:");
		System.out.println(String.format("%.0f", Math.floor(notesOf100)) + " nota(s) de R$ 100.00");
		System.out.println(String.format("%.0f", Math.floor(notesOf50)) + " nota(s) de R$ 50.00");
		System.out.println(String.format("%.0f", Math.floor(notesOf20)) + " nota(s) de R$ 20.00");
		System.out.println(String.format("%.0f", Math.floor(notesOf10)) + " nota(s) de R$ 10.00");
		System.out.println(String.format("%.0f", Math.floor(notesOf5)) + " nota(s) de R$ 5.00");
		System.out.println(String.format("%.0f", Math.floor(notesOf2)) + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS: ");
		System.out.println(String.format("%.0f", Math.floor(coinOf1)) + " moeda(s) de R$ 1.00");
		System.out.println(String.format("%.0f", Math.floor(coinOf50)) + " moeda(s) de R$ 0.50");
		System.out.println(String.format("%.0f", Math.floor(coinOf25)) + " moeda(s) de R$ 0.20");
		System.out.println(String.format("%.0f", Math.floor(coinOf10)) + " moeda(s) de R$ 0.10");
		System.out.println(String.format("%.0f", Math.floor(coinOf5)) + " moeda(s) de R$ 0.05");
		System.out.println(dec.format(coinOf1cent) + " moeda(s) de R$ 0.01");
		
	}

}
