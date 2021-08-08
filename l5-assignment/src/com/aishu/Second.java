package com.aishu;

import java.util.Scanner;

//  Even or odd
public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to know if it is odd or even: ");
        int num = input.nextInt();
        if(num%2==0)
        {
            System.out.println(num + " is an EVEN number");
        }
        else {
            System.out.println(num + " is an ODD number");
        }
    }
}
