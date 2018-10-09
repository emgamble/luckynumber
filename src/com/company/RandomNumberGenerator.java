package com.company;

/**
 * Created by eg913 on 10/9/18.
 */
public class RandomNumberGenerator {

    public String name;
    public int r;
    public int luckyNumber;

    public RandomNumberGenerator(String n){
        name = n;
        r = (int) (Math.random() * 10);
        luckyNumber = r * r;
        //System.out.println("Hello " + name + "! " + "Your Lucky number is " + luckyNumber + ".");
    }
}
