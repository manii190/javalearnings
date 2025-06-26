package com.abhi.javaIntro;
/* https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
question-13*/
public class Problem_13 {
    public static void nNumberTriangle(int n) {
        int count= 1;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

}
