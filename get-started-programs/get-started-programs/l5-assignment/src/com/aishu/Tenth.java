package com.aishu;

import java.util.Scanner;

//  Find the Largest of all until Zero
public class Tenth {
    public static void main(String[] args) {
        System.out.println("Please Enter some random inputs:");
        Scanner input = new Scanner(System.in);
        int largest = 0;
        while(true){
            int num = input.nextInt();
            if(largest<num)
            {
                largest=num;
            }
            if(num==0)
            {
                break;
            }
        }
        System.out.println("The largest of all that was entered is "+largest);
    }
}
