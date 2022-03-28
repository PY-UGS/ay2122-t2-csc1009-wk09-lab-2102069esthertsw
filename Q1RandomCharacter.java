package com.esther.lab.wk09;
import java.util.Random;

public class Q1RandomCharacter {
    private Random random = new Random();

    public Q1RandomCharacter(){
    }
    public int getRandomNumberInRange(int range){
        return random.nextInt(range);
    }

    public char getRandomLowerCaseLetter(int randomFactor){
        return (char)('a' + randomFactor);
    }

    public char getRandomUpperCaseLetter(int randomFactor){
        return (char)('A' + randomFactor);
    }
    public char getRandomDigitCharacter(int randomFactor){
        return (char)('0' + randomFactor);
    }

    public char getRandomCharacter(int randomFactor){
        if (randomFactor == 0)
        {
            randomFactor = getRandomNumberInRange(25);
            return getRandomLowerCaseLetter(randomFactor);
        }
        else if(randomFactor == 1){
            randomFactor = getRandomNumberInRange(25);
            return getRandomUpperCaseLetter(randomFactor);
        }
        else{
            randomFactor = getRandomNumberInRange(9);
            return getRandomDigitCharacter(randomFactor);
        }
    }

    public void printAnswer(char answer){
        System.out.print(answer);
    }

    public static void main(String[] args){
        Q1RandomCharacter randomChar = new Q1RandomCharacter();
        char answer;

        System.out.println("random lower case character:");
        for(int i=0; i<15; i++) {
            int randomFactor = randomChar.getRandomNumberInRange(25);
            answer = randomChar.getRandomLowerCaseLetter(randomFactor);
            randomChar.printAnswer(answer);
            if(i != 14){
            System.out.print(", ");}
        }

        System.out.println("\nrandom upper case character: ");
        for(int i=0; i<15; i++) {
            int randomFactor = randomChar.getRandomNumberInRange(25);
            answer = randomChar.getRandomUpperCaseLetter(randomFactor);
            randomChar.printAnswer(answer);
            if(i != 14){
                System.out.print(", ");}
        }

        System.out.println("\nrandom digit: ");
        for(int i=0; i<15; i++) {
            int randomFactor = randomChar.getRandomNumberInRange(9);
            answer = randomChar.getRandomDigitCharacter(randomFactor);
            randomChar.printAnswer(answer);
            if(i != 14){
                System.out.print(", ");}
        }
        System.out.println("\nrandom character:");
        for(int i=0; i<15; i++) {
            int randomFactor = randomChar.getRandomNumberInRange(2);
            answer = randomChar.getRandomCharacter(randomFactor);
            randomChar.printAnswer(answer);
            if(i != 14){
                System.out.print(", ");}
        }
    }
}
