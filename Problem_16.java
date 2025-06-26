package com.abhi.javaIntro;

public class Problem_16 {

	    public static void reverseAlphaSymmetricTriangle(int n) {
	        for (int i = n; i >= 1; i--) {
	            System.out.print(" ".repeat(n-i));
	      
	                System.out.print("  ");
	            for (int j = 0; j < i; j++) {
	                System.out.print((char) ('A' + j) + " ");
	            }
	            for (int j = i - 2; j >= 0; j--) {
	                System.out.print((char) ('A' + j) + " ");
	            }

	            System.out.println();
	        }
	    }

}
