package com.abhi.javaIntro;

public class Problem_8 {
	
/* https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
question-8*/


    public static void nStarTriangle(int n) {
        for(int i=1;i<=n;i++){
        	
            System.out.println(" ".repeat(n-i)+"*".repeat((2*i)-1));
        }
    
    
    }
}
	

