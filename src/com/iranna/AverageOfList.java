package com.iranna;


import java.util.Arrays;
import java.util.List;

public class AverageOfList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        double average = numbers.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .average()
                .orElse(0.0); // Handle empty list

        System.out.println("Average: " + average);
    }
}