package br.com.beecrowd.beginner;

import java.util.Scanner;

public class SelectionTest1 {

	public static void main(String[] args) {
		
		int a =0, b=0, c=0, d=0;
		
		Scanner scanner = new Scanner(System.in);
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		d=scanner.nextInt();
		
		if(b>c && d>a && (c+d)>(a+b)&& c>0 && d>0 && (a%2==0)) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}

	}

}
