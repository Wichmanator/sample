package org.wichmanator.sample;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class EarlyObjects {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        double radius = input.nextDouble();
        System.out.printf("Volume is %f%n", sphereVolume(radius));
    }

    public static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    public int justSomeBoringMath() {

        int total = 0;
        for (int number = 2; number <= 8; total += number, number +=2) {
        }
        return total;
    }
    public String gandalfTheGrey() {
        int counter = 1;
        do {
            System.out.println("you can pass");
            counter++;
        } while (counter <= 3);
        System.out.println("YOU SHALL NOT PASS!");
        return "YOU SHALL NOT PASS!";
         /*{
        for (int counter = 1; counter <= 3; counter++) {
            System.out.println("you can pass");
        }
        System.out.println("YOU SHALL NOT PASS!");
        return "YOU SHALL NOT PASS!";
    }*/
    /*{
        int counter = 1;
        while (counter++ <= 3) {
            System.out.println("you can pass");
        }
        System.out.println("YOU SHALL NOT PASS!");
        return "YOU SHALL NOT PASS!";
    }*/
    }
    public String whichCountryToGo() {
        Countries clist = new Countries();
        String[] country = clist.getCountries();
        Random random = new Random();
        int index = random.nextInt(country.length);
        System.out.println(country[index]);
        return country[index];
    }
    public String counter() {
        int count = 1;
        if (count <= 10) {
            return "Count is greater than 10";
        } else {
            return "Count is not";
        }
    }
    public String twoFaceDecidesYourFate() {
        String decision = new String();
        SecureRandom randomNumbers = new SecureRandom();
        int coinFace = 1 + randomNumbers.nextInt(2);
        if(coinFace == 1) {
            decision = "death";
            System.out.println("Congrats...Two-Face just blessed you with death.");
        } else {
            decision = "life";
            System.out.println("You get to live yet another day.");
        }
        return decision;
    }
}
