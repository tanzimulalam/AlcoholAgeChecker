package com.project1;
import java.util.Scanner;
public class AlcoholChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age < 21) {
            System.out.println("You are too young to buy alcohol");
        } else {
            System.out.println("You are allowed to buy alcohol");
        }
    }
}
