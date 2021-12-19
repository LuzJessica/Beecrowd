package br.com.beecrowd.beginner;


import java.util.Scanner;

public class CoordinatesOfAPoint {

	public static void main(String[] args) {
		
		float x=0, y=0;
		
		Scanner sc = new Scanner(System.in);
		
		x=sc.nextFloat();
		y=sc.nextFloat();
		
		if(x==0 && y==0) {
			System.out.println("Origem");
		}else if(x>0 && y>0) {
			System.out.println("Q1");
		}else if(x>0 && y<0) {
			System.out.println("Q4");
		}else if(x<0 && y>0) {
			System.out.println("Q2");
		}else if(x<0 && y<0) {
			System.out.println("Q3");
		}
		
		if((x>0 || x<0) && y==0){
			System.out.println("Eixo X");
		}else if((y>0 || y<0) && x==0) {
			System.out.println("Eixo Y");
		}

	}

}
