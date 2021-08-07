package com.aishu;

import java.util.Scanner;
public class First {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Enter a number to find it's Factorial: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i,ans=1;
        for(i=num;i>1;i--)
        {
            ans*=i;
        }
        System.out.println("The Factorial of "+num+" is "+ans+" :)");
    }
}
