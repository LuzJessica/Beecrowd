package br.com.beecrowd.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average3 {

	public static void main(String[] args) {
		double n1=0 , n2=0 , n3=0 ,n4=0, exame;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("#0.0");
		
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		n3=sc.nextDouble();
		n4=sc.nextDouble();
		
		double media = ((n1*2) + (n2*3) + (n3*4) + (n4*1))/(2+3+4+1);
		double mediaExame;
		System.out.println("Media: " + dc.format(media));
		
		if(media>=7) {
			System.out.println("Aluno aprovado.");
		}else if(media<5) {
			System.out.println("Aluno reprovado.");
		}else if(media >=5 && media <=6.9) {
			System.out.println("Aluno em exame.");
			exame=sc.nextDouble();
			System.out.println("Nota do exame: " + dc.format(exame));
			mediaExame = (media + exame)/2;
			if(mediaExame>=5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + dc.format(mediaExame));
			}else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + dc.format(mediaExame));
			}
			
		}

	}

}
