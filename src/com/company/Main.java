package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner NameReader = new Scanner(System.in);

        int j = 0;
        while (j < 1) {
            System.out.println("What is your name? ");
            String name = NameReader.nextLine();
            RandomNumberGenerator luckynumber = new RandomNumberGenerator(name);
            System.out.println("Hello " + luckynumber.name + "! Your lucky number is " + luckynumber.luckyNumber);

            Scanner NextAction = new Scanner(System.in);
            System.out.println("Press O to exit, Press 1 for a listing of the name and lucky number, or Press 2 to enter another name");
            int NextAct = NextAction.nextInt();

            if (NextAct == 0) {
                break;
            } else if (NextAct == 1) {
                System.out.println("Name: " + luckynumber.name + "   " + "Lucky Number: " + luckynumber.luckyNumber);
                break;
            }


        }
    }
}