package com.aishu;

import java.util.Scanner;

public class Count_occurrences {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long number = in.nextLong();
        long store =number;
        System.out.print("Enter the digit to find count of occurrence for: ");
        long target = in.nextLong();
        long temp,count=0;
        while(number>0){
            temp=number%10;
            number/=10;
            if(temp==target){
                count++;
            }
        }
        System.out.println(target+" has occurred "+count+" times in the number "+store);

    }
}
