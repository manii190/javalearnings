package com.abhi.javaIntro;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("Hello World");
	/*	
		int x = 10;
		double y = 10;
		
		char c = 'a';
		char d = '1';
		int arr[]= {1,2,3,4,5,6,7,8,9};
			for i in range (len(arr)):
			print(arr[i]))
		for (int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

		
		
		System.out.println(x+","+y);
        String var = "abhiram";
        
        System.out.println("var:"+var);
        
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        	                                   */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("isPrime:"+isPrimeNumber(num));
		
		sc.close();
	}
	public static String isPrimeNumber(int n) {
		int count = 0;
		
		//21 - 1, 2, 3, 4, 5, ... , 19, 20, 21
		
		// 1 * 21 =21

		// Squareroot()
		for (int i=1 ;i<(21) ;i++) {
			if (n % i ==0 ) {
				count = count + 1;
				if (count>2) {
					break;
				}
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
