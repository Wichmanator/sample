package org.wichmanator.sample;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        double chargeBase = 2.00;
        int hours;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter total hours for the first car: ");
        hours = scan.nextInt();
        if (hours <= 3) {
            System.out.println("Your total charge is: $" + chargeBase);
        }
        else if (hours >= 4 && hours <= 18) {
            double chargedHourlyRate = (hours - 3) * .50;
            double totalCharge = chargedHourlyRate + chargeBase;
            DecimalFormat df2 = new DecimalFormat("#.00");
            System.out.println("Your total charge is: $" + df2.format(totalCharge));
        }
        else if (hours >= 19 && hours <= 24) {
            System.out.println("Your total charge is: $10.00");
        } else {
            System.out.println("hours cannot exceed 24 hours");
        }
    }
}

