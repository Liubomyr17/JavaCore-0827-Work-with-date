package com.company;

/*
0827 Work with date
1. Implement the isDateOdd (String date) method so that it returns true if the number of days since the beginning of the year is an odd number, otherwise false
2. String date is transmitted in the format MAY 1 2013
Do not forget to take into account the first day of the year.
Example:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Requirements:
1. The program should display the text on the screen.
2. The Solution class must contain two methods.
3. The isDateOdd () method should return true if the number of days since the beginning of the year is an odd number, otherwise false.
4. The main () method should call the isDateOdd () method.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date inputTime = new Date(date);
        Date startTime = new Date("JAN 1 " + inputTime.getYear());
        long days = (inputTime.getTime() - startTime.getTime()) / 1000 / 60 / 60 / 24;
        return days % 2 == 0;
    }
}





