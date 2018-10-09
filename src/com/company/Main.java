package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner NameReader = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = NameReader.nextLine();
        RandomNumberGenerator luckynumber = new RandomNumberGenerator(name);
        System.out.println("Hello " + luckynumber.name + "! Your lucky number is " + luckynumber.luckyNumber );

        Scanner NextAction = new Scanner(System.in);
        

    }
}
