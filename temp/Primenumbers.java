package com.abhi.javaIntro;

import java.util.Scanner;

public class Primenumbers {
	
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("isPrime:"+isPrimeNumber(num));
		
		sc.close();
	}
	
	public static String isPrimeNumber(int n) {
		int count = 0;
		for (int i=1 ;i<n+1 ;i++) {
			if (n % i ==0 ) {
				count = count + 1;
			}
			
		}
		if (count==2) {
			return "prime";
		}
		else {
			return "not prime";
		}
		
		
	}

}
