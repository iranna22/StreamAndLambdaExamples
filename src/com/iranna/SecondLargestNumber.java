package com.iranna;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SecondLargestNumber {

    public static void main(String[] args) {
       // int[] numbers = {1, 3, 2, 5, 3};

       
        List<Integer> numberList = Arrays.asList(1, 3, 2, 5, 3);
               int secondLargest= numberList.stream().distinct() // Remove duplicates
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1) // Skip the largest number
                .findFirst()
                .orElse(Integer.MIN_VALUE); // Handle empty stream case

        System.out.println("Second largest number: " + secondLargest);
    }
}