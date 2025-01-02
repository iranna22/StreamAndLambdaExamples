package com.iranna;


import java.util.Arrays;
import java.util.List;

public class FindMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 3, 15);

        // Find maximum number using stream
        Integer max = numbers.stream()
                .max(Integer::compare) 
                .orElse(null); 

        // Find minimum number using stream
        Integer min = numbers.stream()
                .min(Integer::compare) 
                .orElse(null);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}