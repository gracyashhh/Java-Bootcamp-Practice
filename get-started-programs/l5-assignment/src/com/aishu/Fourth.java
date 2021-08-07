package com.aishu;

import java.util.Scanner;

// Simple Interest
public class Fourth {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Interest Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Principle amount: ₹");
        float principle = input.nextFloat();
        System.out.print("Please Enter the Time: ");
        float time = input.nextFloat();
        System.out.print("Please Enter the Rate: ");
        float rate = input.nextFloat();
        float interest = (principle * time * rate)/100;
        System.out.println("The Simple interest is "+interest);
    }
}
