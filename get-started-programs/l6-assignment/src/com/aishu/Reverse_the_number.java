package com.aishu;

import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int rem,ans=0,num = in.nextInt();
        int backup=num;
        while (num>0)
        {
            rem=num%10;
            num/=10;
            ans=ans*10+rem;
        }
        System.out.println("The reverse of "+backup+" is "+ans);
    }
}
