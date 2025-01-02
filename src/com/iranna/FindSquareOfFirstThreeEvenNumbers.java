package com.iranna;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//find the square of the first three even numbers
public class FindSquareOfFirstThreeEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squaresOfFirstThreeEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0) // Filter out even numbers
                .map(number -> number * number) // Square each even number
                .limit(3) // Limit the stream to the first three even numbers
                .collect(Collectors.toList()); // Collect the results into a list

        System.out.println("Squares of the first three even numbers: " + squaresOfFirstThreeEvenNumbers);
    }
}