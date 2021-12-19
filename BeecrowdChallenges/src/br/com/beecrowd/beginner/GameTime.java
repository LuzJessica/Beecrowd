package br.com.beecrowd.beginner;

import java.util.Scanner;

public class GameTime {

	public static void main(String[] args) {
		
		int a=0, b=0;
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		int duration = 0;
		
		if(a>b || a==b) {
			duration = (24-a) + b;
		}else {
			duration = b-a;
		}
		
		System.out.println("O JOGO DUROU " + duration + " HORA(S)");

	}

}
