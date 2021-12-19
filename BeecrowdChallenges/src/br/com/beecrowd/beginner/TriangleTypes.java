package br.com.beecrowd.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class TriangleTypes {

	public static void main(String[] args) {
		
		double a=0, b=0, c=0;
		
		Scanner sc = new Scanner(System.in);
		List<Double> numbers = new ArrayList<Double>();
		
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		
		List<Double> sortedNumber = numbers.stream().sorted().collect(Collectors.toList());
		
		a=sortedNumber.get(2);
		b=sortedNumber.get(1);
		c=sortedNumber.get(0);
		
		if(a >= b+c) {
			System.out.println("NAO FORMA TRIANGULO");			
		}else {
			if(Math.pow(a, 2) == ((Math.pow(b, 2) + (Math.pow(c, 2))))){
				System.out.println("TRIANGULO RETANGULO");
			}
			if(Math.pow(a, 2) > ((Math.pow(b, 2) + (Math.pow(c, 2))))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(Math.pow(a, 2) < ((Math.pow(b, 2) + (Math.pow(c, 2))))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if( a==b && b==c ) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if( (a==b && a!=c) || (b==c && b!=a) || (c==a && c!=b)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		
	}

}
