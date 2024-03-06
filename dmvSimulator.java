/*
 * Jeremy Wiening
 * CSC109
 * DMV Simulation
 */

import java.util.Random;

public class dmvSimulator{

    private static int randomNumber() {
        Random random = new Random();
        return random.nextInt(200) + 1;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the DMV!");

        int userNumber = randomNumber();
        System.out.println("Your number is: " + userNumber + ". Please wait until your number is called.");

        int currentNumber = userNumber + 1; // Start from the number 1 greater than users number

        while (currentNumber != userNumber) {
            System.out.println("Number " + currentNumber + " please come to the counter.");
            currentNumber++; //Increment currentnumber (+1 each time around the loop)
            if (currentNumber > 200) {
                currentNumber = 1;
            }
        }

        System.out.println("Number " + userNumber + ", you're up. Please come to the counter.");
        System.out.println("You don't have the required paperwork. GET OUT! HAHAHAHAHAHAHAHAHAHA!!!!");
    }
}