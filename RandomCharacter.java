package com.esther.lab.wk09;
import java.util.Random;
public class RandomCharacter {
    public static Random r = new Random(); //Random class object to be used by all functions to generate random integer
    
    public static char getRandomLowerCaseLetter() {
        //random integer from 0 to 25, add to ASCII of 'a' to generate random digit
        return (char) (r.nextInt(26) + 'a');
    }

    public static char getRandomUpperCaseLetter() {
        //random integer from 0 to 25, add to ASCII of 'A' to generate random digit
        return (char) (r.nextInt(26) + 'A');
    }

    public static char getRandomDigitCharacter() {
        //random integer from 0 to 9, add to ASCII of '0' to generate random digit 
        return (char) (r.nextInt(10) + '0'); 
    }

    public static char getRandomCharacter() {
        int randomCharType = r.nextInt(3);  //randomise between the 3 following random character generators
        char answer = ' '; 

        if(randomCharType == 0){
            answer = getRandomLowerCaseLetter();
        }
        else if(randomCharType == 1){
                answer = getRandomUpperCaseLetter();
        }
        else if(randomCharType == 2){
            answer = getRandomDigitCharacter();
        }
        return answer;
    }

    public static boolean isPrime(int val) {
        boolean isPrime = true; //true unless proven false below

        if (val == 0 || val == 1) { //base case
            isPrime = false;
            return isPrime;
        }

        else {
            for (int i = 2; i <= Math.sqrt(val); i++) { //any factor of a number will be <= square root of the number
                if (val % i == 0) { //if value is divisible by one of the integers <= sqrt of the number, it is not prime
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 15; //number of times to run each function below

        System.out.println("\nRandom Lowercase Letter: ");
        for (int i = 0; i < n; i++) { //call function n times
            System.out.print(getRandomLowerCaseLetter() + " ");
        }

        System.out.println("\nRandom Uppercase Letter: ");
        for (int i = 0; i < n; i++) { 
            System.out.print(getRandomUpperCaseLetter() + " ");
        }

        System.out.println("\nRandom Digit: ");
        for (int i = 0; i < n; i++) {
            char digit = getRandomDigitCharacter();
            boolean isPrime = isPrime(digit - '0'); //convert digit from character to int
            if (isPrime == true) {
                System.out.print(digit + " (Prime)");
            } else {
                System.out.print(digit);            
            }
            if(i!= n-1){
            System.out.print(", "); //formatting, comma separated output 
            }
        }

        System.out.println("\nRandom Character: ");
        for (int i = 0; i < n; i++) {
            System.out.print(getRandomCharacter() + " ");
        }

    }
}