package com.ll;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new App(sc).run(); // App 객체를 만들고 run을 한다.

        sc.close();
    }
}