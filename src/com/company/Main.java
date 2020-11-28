package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите год:");

        int year = s.nextInt();
        boolean intercalaryYear = false;
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    intercalaryYear = true;
                else
                    intercalaryYear = false;
            } else
                intercalaryYear = true;
        } else
            intercalaryYear = false;

        if (intercalaryYear)
            System.out.println(year + " Это высокосный год!");
        else
            System.out.println(year + " Это не высокосный год.");
    }
}

