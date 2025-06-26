package com.abhi.javaIntro;
/* https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
question-14*/
public class Problem_14 {
    public static void nLetterTriangle(int n) {
        for (int i = 1; i <= n; i++)
         {
            char c = 'A';
            for (int j = 1; j <= i; j++) {  
                System.out.print(c + " ");
                c++;
            }
            System.out.println();  
        }
    }
}
