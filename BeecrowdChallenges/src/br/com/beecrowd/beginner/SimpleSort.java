package br.com.beecrowd.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleSort {

	public static void main(String[] args) {
		
		int a=0, b=0, c=0;
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> originalSequence = new ArrayList<Integer>();
		a =sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		originalSequence.add(a);
		originalSequence.add(b);
		originalSequence.add(c);
		
		List<Integer> sortedSequence = originalSequence.stream().sorted().collect(Collectors.toList());
		
		sortedSequence.forEach(s->System.out.println(s));
		System.out.println("");
		originalSequence.forEach(o->System.out.println(o));
		
	}

}
