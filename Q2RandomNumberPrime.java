package com.esther.lab.wk09;
import java.util.Random;

public class Q2RandomNumberPrime{
    private Random random = new Random();

    public int getRandomNumberInRange(int range){
        return random.nextInt(range);
    }

    public boolean isPrime(int inputNum){
        for (int i = 2; i < (Math.sqrt(inputNum)); i++) { //factors <sqrt of the number
            if (inputNum % i == 0) {
              return false;
            }
          }
          return true;
    }

    public static void main(String[] args){
        Q2RandomNumberPrime a = new Q2RandomNumberPrime();
        for(int i = 0; i<15; i++){
            int randomNumber = a.getRandomNumberInRange(1000);
            if(a.isPrime(randomNumber)){
                System.out.print(randomNumber + " (Prime)" + ", ");
            }
            else{
                System.out.print(randomNumber + ", ");
            }
        }

        System.out.println("random lower case character:");
    }
}