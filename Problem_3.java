package com.abhi.javaIntro;

public class Problem_3 {
    public static void nTriangle(int n) {
        for (int i = 1;i <= n;i++){
            for (int j =1;j <= i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

}
