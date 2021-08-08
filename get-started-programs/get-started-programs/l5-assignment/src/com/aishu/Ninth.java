package com.aishu;

import java.util.Scanner;

//  Print sum of all until 0
public class Ninth {
    public static void main(String[] args) {
        System.out.println("Please Enter Random inputs:");
        Scanner input = new Scanner(System.in);
        int ans=0;
        while(true)
        {
            int number = input.nextInt();
            ans+=number;
            if(number==0) {
                break;
            }
        }
        System.out.println(ans);
    }
}
