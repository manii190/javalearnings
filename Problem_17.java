package com.abhi.javaIntro;

public class Problem_17 {
    public static void alphaHill(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("  ".repeat(n - i));
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




