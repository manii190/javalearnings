package com.abhi.javaIntro;
/* https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
question-9*/
public class Problem_9 {
    public static void nStarDiamond(int n) {
    for(int i =1;i<=n;i++){
        System.out.println(" ".repeat(n-i)+"*".repeat((2*i)-1));
    }
    for (int i=n;i>=1;i--){
             System.out.println(" ".repeat(n-i)+"*".repeat((2*i)-1));
        }
    }

}
