package br.com.beecrowd.beginner;

import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		
		double value = 0.0000;
		
		Scanner scanner = new Scanner(System.in);
		
		value = scanner.nextDouble();
		
		if(value < 0d || value > 100d) {
			System.out.println("Fora do intervalo");
		}else {
			if(value >= 0d  && value <=25d) {
				System.out.println("Intervalo [0,25]");
			}else if(value>25d && value<=50d) {
				System.out.println("Intervalo (25,50]");
			}else if(value>50d && value<=75d) {
				System.out.println("Intervalo (50,75]");
			}else if(value>75d && value <= 100d) {
				System.out.println("Intervalo (75,100]");
			}
		}

	}

}
