package com.abhi.javaIntro;
/* https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
question-12*/
public class Problem_12 {
    public static void numberCrown(int n) {
        for ( int i =1;i<=n;i++){
            for ( int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            int  space =2 * (n-i);
            System.out.print("  ".repeat(space));
            for ( int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


