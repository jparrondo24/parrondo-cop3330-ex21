/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int month = in.nextInt();

        String strMonth = "";
        switch(month) {
            case 1:
                strMonth = "January";
                break;
            case 2:
                strMonth = "February";
                break;
            case 3:
                strMonth = "March";
                break;
            case 4:
                strMonth = "April";
                break;
            case 5:
                strMonth = "May";
                break;
            case 6:
                strMonth = "June";
                break;
            case 7:
                strMonth = "July";
                break;
            case 8:
                strMonth = "August";
                break;
            case 9:
                strMonth = "September";
                break;
            case 10:
                strMonth = "October";
                break;
            case 11:
                strMonth = "November";
                break;
            case 12:
                strMonth = "December";
                break;
            default:
                System.out.println("Invalid!");
                return;
        }

        System.out.printf("The name of the month is %s.\n", strMonth);
    }
}
