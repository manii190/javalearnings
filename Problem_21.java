package com.abhi.javaIntro;

public class Problem_21 {
	    public static void getStarPattern(int n) {
	                for (int i = n - 1; i >= 0; i--) {
	            if (i == 0 || i == n - 1) {
	                System.out.println("*".repeat(n));
	            } else {
	                System.out.println("*" + " ".repeat(n - 2) + "*");
	            }
	    }
	}
	
}

