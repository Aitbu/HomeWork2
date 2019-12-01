package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println();
        System.out.println("What is the temperature outside?");
        int temp = sc.nextInt();

        if ((age >20 || age <45)&&(temp > +30 || temp < -20)) {
            System.out.println("Can not go outside!");
        } else if ((age <20)&& (temp>0 || temp<28 )) {
            System.out.println("Can not go outside!");
        } else if ((age >45)&&(temp >-10|| temp<25)){
            System.out.println("Can not go outside!");
        } else {
            System.out.println("You can  go outside!");
        }

    }
}
