package com.codegym;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public static String fizzBuzz(int number){
        boolean divisibleByThree = number % 3 == 0;
        boolean divisableByFive = number % 5 == 0;
        boolean divisableByFifteen = divisableByFive && divisibleByThree;

        if (divisableByFifteen) return FIZZBUZZ;
        if (divisibleByThree) return FIZZ;
        if (divisableByFive) return BUZZ;
        return number + "";
    }

    public static void main(String[] args) {
        for (int i = 1; i<= 50; i++){
            System.out.println(fizzBuzz(i));
        }
    }
}