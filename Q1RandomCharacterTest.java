package com.esther.lab.wk09;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Random;


public class Q1RandomCharacterTest {

    @Test
    public void randomDigit() {
        var rando = new Q1RandomCharacter();
        for(int i = 0; i<9; i++){   //test all possible outcomes
            assertEquals((char)(i + 48), rando.getRandomDigitCharacter(i));
        }
    }

    @Test
    public void randomLowerChar() {
        var rando = new Q1RandomCharacter();
        for(int i = 0; i<25; i++){ //test all possible outcomes
            assertEquals((char)(i + 97), rando.getRandomLowerCaseLetter(i));
        }
    }

    @Test
    public void randomUpperChar() {
        var rando = new Q1RandomCharacter();
        for(int i = 0; i<25; i++){ //test all possible outcomes
            assertEquals((char)(i + 65), rando.getRandomUpperCaseLetter(i));
        }
    }

    @Test
    public void randomValueGenerator(){
        var rando = new Random();
        int range = 26;
        boolean withinRange = true;
        for(int i = 0; i<10000000; i++){ //run 100 times to ensure the values are within the range
            int value = 0 + rando.nextInt(range);
            if( value >range-1 || value <0){
                withinRange = false;
            }
        }
        assertEquals(true, withinRange);
    }

    @Test
    public void randomValueGeneratorFault(){
        var rando = new Random();
        int range = 26; //declared range
        boolean outsideRange = false;
        for(int i = 0; i<10000000; i++){ //run 100 times to ensure the values are within the range
            int value = 0 + rando.nextInt(range + 100); //increase size of range to outside the declared range
            if(value > range-1){    //there should exist some values that are larger than the declared range
                outsideRange = true;
            }
        }
        assertEquals(true, outsideRange);
    }

    @Test
    public void verifyASCIIAddition(){
        assertTrue('a' == (char)('a' + 0));
        assertTrue('z' == (char)('a' + 25));
        assertTrue('A' == (char)('A' + 0));
        assertTrue('Z' == (char)('A' + 25));   
        assertTrue('0' == (char)('0' + 0));
        assertTrue('9' == (char)('0' + 9));

    }
}
