package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 1
        int tenWhile = 1;
        while (tenWhile <= 10) {
            System.out.println(tenWhile++);
        }
        for (int tenFor = 10; tenFor >= 1; tenFor--) {
            System.out.println(tenFor);
        }

        //Task 2
        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Today is " + friday + " of april");
        }

        //Task
        for (int year = 0; year < 2100; year = year + 79) {
            if (year > 1822) {
                System.out.println(year);
            }

        }
    }
}