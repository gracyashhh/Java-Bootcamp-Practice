package com.aishu;

import java.util.Scanner;

//  Factors of a number with array
public class Seventh {
    public static void main(String[] args) {
        System.out.print("Enter a number to find it's Factors: ");
        Scanner input = new Scanner(System.in);
        int i,num = input.nextInt();
        int ans[] = new int[num];
        int cnt=0;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                ans[cnt]=i;
                cnt++;
            }
        }

        System.out.println("The Factors of "+num+" are :");
        for(i=0;i< ans.length;i++)
        {
            if(ans[i]!=0) {
            System.out.print(ans[i] + " ");
        }

        }

    }
}
