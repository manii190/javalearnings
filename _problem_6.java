package com.abhi.javaIntro;

public class _problem_6 {
    public static void nNumberTriangle(int n) {
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
