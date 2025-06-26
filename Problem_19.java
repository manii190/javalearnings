package com.abhi.javaIntro;

public class Problem_19 {
    public static void symmetry(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print("* ".repeat(i + 1));
            System.out.print("  ".repeat(2 * (n - i - 1)));
            System.out.println("* ".repeat(i + 1));
                }

        for (int i = 0; i < n; i++) {
            System.out.print("* ".repeat(i + 1));
            System.out.print("  ".repeat(2 * (n - i - 1)));
            System.out.println("* ".repeat(i + 1));
         }
    }
}
