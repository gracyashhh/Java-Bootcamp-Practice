package com.aishu;

import java.util.Scanner;

// Calculator
public class Fifth {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator🥳");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = input.nextFloat();
        System.out.print("Enter the operation want to perform: ");
        char symbol = input.next().charAt(0);

        if(symbol=='+'){
            System.out.println("The Sum is "+num1+num2);
        }else if(symbol=='-'){
            System.out.println("The Difference is "+(num1-num2));

        }else if(symbol=='*'){
            System.out.println("The Product is "+num1*num2);

        }else if(symbol=='/'){
            System.out.println("The Quotient is "+num1/num2);

        }
        else{
            System.out.println("Invalid Operator");

        }

    }
}
