package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test input = 3; expected = Fizz")
    public void testInputThreeExpectedFizz(){
        int inputNumber = 3;
        String expected = FizzBuzz.FIZZ;
        String result = FizzBuzz.fizzBuzz(inputNumber);
        assertEquals(expected, result);
}
    @Test
    @DisplayName("Test input = 5; expected = Buzz")
    public void testInputFiveExpectedBuzz(){
        int inputNumber = 5;
        String expected = FizzBuzz.BUZZ;
        String result = FizzBuzz.fizzBuzz(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test input = 15; expected = FizzBuzz")
    public void testInputFifteenExpectedBuzz(){
        int inputNumber = 15;
        String expected = FizzBuzz.FIZZBUZZ;
        String result = FizzBuzz.fizzBuzz(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test input = 16; expected = 16")
    public void testInputSixteenExpectedSixteen(){
        int inputNumber = 16;
        String expected = "16";
        String result = FizzBuzz.fizzBuzz(inputNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test input = array")
    public void testInputArray(){
        int[] inputArray = new int[]{1,2,3,4,5,13,14,15,16};
        String[] expectedValues = new String []{"1", "2", FizzBuzz.FIZZ, "4", FizzBuzz.BUZZ, "13", "14", FizzBuzz.FIZZBUZZ, "16"};
        for (int i = 0; i< inputArray.length; i++){
            String result = FizzBuzz.fizzBuzz(inputArray[i]);
            String expected = expectedValues[i];
            assertEquals(expected, result);
        }

    }
}
