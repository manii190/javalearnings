package com.abhi.javaIntro;

public class Problem_20 {
	    public static void symmetry(int n) {
	                    for (int i = 1; i <= n; i++) {
	            System.out.print("* ".repeat(i));
	            System.out.print("  ".repeat(n - i));
	            System.out.print("  ".repeat(n - i));
	            System.out.println("* ".repeat(i));
	        }


	        for (int i = n - 1; i >= 1; i--) {
	            System.out.print("* ".repeat(i));
	            System.out.print("  ".repeat(n - i));
	            System.out.print("  ".repeat(n - i));
	            System.out.println("* ".repeat(i));
	    }
	}
	}

