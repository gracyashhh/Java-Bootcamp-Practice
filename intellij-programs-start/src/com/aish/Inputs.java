package com.aish;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.print("Please enter some input: ");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("My Roll number is " + rollno);
    }
}
