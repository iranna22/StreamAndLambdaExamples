package com.iranna;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Frequency of characters
public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Long> charFrequency = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charFrequency);
    }
}