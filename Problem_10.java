package com.abhi.javaIntro;
/* https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
question-10*/
public class Problem_10 {
    public static void nStarTriangle(int n) {
        for(int i = 1;i<=n;i++){
            System.out.println("*".repeat(i));
        }  
        for (int j =n-1;j>=1;j--){
            System.out.println("*".repeat(j));
        }
      }
}
