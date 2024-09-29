package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        final float pi = 3.14f;
        final float e = 2.71f;
        min();

    }
    public static void min() {
        System.out.println("Каково первое число?? ");
        Scanner scr = new Scanner(System.in);
        double a = scr.nextDouble();
        System.out.println("Каково второе число?? ");
        double b = scr.nextDouble();
        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}