package com.iranna;

import java.util.stream.IntStream;

public class SumOfDigits {

    public static void main(String[] args) {
        int num = 12345;

        int sum = IntStream.of(String.valueOf(num).chars().toArray())
                .map(Character::getNumericValue)
                .sum();

        System.out.println("Sum of digits: " + sum);
    }
}