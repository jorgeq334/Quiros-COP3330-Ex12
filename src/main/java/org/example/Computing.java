package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Computing
{
    public static void main( String[] args )
    {
        System.out.print("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        double total = principal + (int)Math.round(principal*((rate*years)/100));
        System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+total );
    }
}
