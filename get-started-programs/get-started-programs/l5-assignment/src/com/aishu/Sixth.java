package com.aishu;

import java.util.Scanner;

// Largest of two
public class Sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to find the highest:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2) {
            System.out.print(num1);
        }
        else {
            System.out.print(num2);
        }
        System.out.println(" is the largest number.");
    }
}
