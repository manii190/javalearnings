package com.abhi.javaIntro;

public class Problem_22 {
	    public static void getNumberPattern(int n) {
	        int size = 2 * n - 1;
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                int value = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
	                System.out.print(value + "");
	            }
	            System.out.println();
	    }
	}
	
}
