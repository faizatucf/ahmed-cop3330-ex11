/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class currency {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double rate, euros, dollars;
        System.out.println("How many euros are you exchanging?");
        euros = sc.nextDouble();
        System.out.println("What is the exchange rate?");
        rate = sc.nextDouble();
        dollars = rate * euros;
        System.out.println(String.format("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars.",euros,rate,dollars));
    }
}