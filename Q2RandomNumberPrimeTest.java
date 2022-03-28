package com.esther.lab.wk09;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;

import org.junit.Test;

public class Q2RandomNumberPrimeTest {
    @Test
    public void testIsPrime() {
        var a = new Q2RandomNumberPrime();
        boolean primeAlgoValidity = true;
        int[] primeArray = new int[]{2, 3, 5, 7, 11, 13, 37, 41};
        int[] nonprimeArray = new int[]{99, 100, 88, 64, 33, 28, 27};
        for(int i = 0; i<Array.getLength(primeArray)-1; i++){
            if(a.isPrime(primeArray[i]) == false){ 
            primeAlgoValidity = false;
            }
        }
        for(int i = 0; i<Array.getLength(nonprimeArray)-1; i++){
            if(a.isPrime(nonprimeArray[i]) == true){ 
            primeAlgoValidity = false;
            }
        }
        assertTrue(primeAlgoValidity);
    }
}
