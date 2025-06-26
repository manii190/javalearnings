package com.abhi.javaIntro;

public class Problem_18 {
    public static void alphaTriangle(int n) {
        for (int i = 1; i <= n; i++)
 {
    
    for (int j = 1; j <= i; j++) { 
        char c = (char) ('A'+ n-j); 
        System.out.print(c + " ");
        c++;
    }
    System.out.println();  
}
}
	
}
