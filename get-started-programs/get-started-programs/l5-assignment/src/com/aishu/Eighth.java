package com.aishu;

import java.util.Scanner;

//  Rupees to Dollar
public class Eighth {
    public static void main(String[] args) {
        System.out.println("Welcome to Currency Converter!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Amount to be converted: ₹");
        int rupee = input.nextInt();
        double dollar = rupee * 0.013;
        System.out.println("₹"+rupee+" in dollars is $"+dollar);

    }
}
