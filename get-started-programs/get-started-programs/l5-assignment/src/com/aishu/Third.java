package com.aishu;

import java.util.Scanner;

// Greeting message
public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your sweet name: ");
        String name = input.nextLine();
        System.out.println("Nice to meet you "+name+".\nHave a Wonderful day!");
    }
}
