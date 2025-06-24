package com.abhi.javaIntro;

public class _problem_2 {

    void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("* ".repeat(i));  // Works in Java 11+
        }
    }
}