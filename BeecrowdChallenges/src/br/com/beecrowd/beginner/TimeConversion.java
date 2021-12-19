package br.com.beecrowd.beginner;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		
		int timeInSeconds = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		int aux = 0;
		
		timeInSeconds = scanner.nextInt();
		
		hours = timeInSeconds/3600;
		aux = timeInSeconds%3600;
		minutes = aux/60;
		aux = aux%60;
		seconds=aux;
		
		System.out.println(hours+":"+minutes+":"+seconds);
	}

}
