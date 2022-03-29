package com.esther.lab.wk09;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;


public class RandomCharacterTest {

    @Test
    public void randomLowerCaseLetterTest() {
        for (int i = 0; i < 15; i++) {
            char letter = RandomCharacter.getRandomLowerCaseLetter();
            assertTrue(letter >= (int)'a' && letter <= (int)'z');
        }
    }

    @Test
    public void randomUpperCaseLetterTest() {
        for (int i = 0; i < 15; i++) {
            char letter = RandomCharacter.getRandomUpperCaseLetter();
            assertTrue(letter >= (int)'A' && letter <= (int)'Z');
        }
    }

    @Test
    public void randomDigitCharacterTest() {
        for (int i = 0; i < 15; i++) {
            char digit = RandomCharacter.getRandomDigitCharacter();
            assertTrue(digit >= (int)'0' && digit <= (int)'9');
        }
    }

    @Test
    public void isPrimeTruePositiveTest() {
        var a = new RandomCharacter();
        boolean primeAlgoValidity = true;
        int[] primeArray = new int[]{2, 3, 5, 7, 11, 13, 37, 41};
        for(int i = 0; i<Array.getLength(primeArray)-1; i++){
            if(a.isPrime(primeArray[i]) == false){ 
            primeAlgoValidity = false;
            }
        }
        assertTrue(primeAlgoValidity);
    }

    @Test
    public void sPrimeTrueNegativeTest() {
        var a = new Q2RandomNumberPrime();
        boolean primeAlgoValidity = true;
        int[] nonprimeArray = new int[]{99, 100, 88, 64, 33, 28, 27};
        for(int i = 0; i<Array.getLength(nonprimeArray)-1; i++){
            if(a.isPrime(nonprimeArray[i]) == true){ 
            primeAlgoValidity = false;
            }
        }
        assertTrue(primeAlgoValidity);
    }

    @Test
    public void randomCharacterTest() {

        for (int i = 0; i < 15; i++) {

            char testChar = RandomCharacter.getRandomCharacter();

            assertTrue((testChar >= (int)'A' && testChar <= (int)'Z')
                        || (testChar >= (int)'a' && testChar <= (int)'z')
                        || (testChar >=(int)'0' && testChar <= (int)'9'));        
        }
    }
}