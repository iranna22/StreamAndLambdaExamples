package com.iranna;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "Hello Java world";
		String[] words = str.split(" ");

		//without using stream
		String reversedStr = "";
		for (String word : words) {
			String reversedWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord += word.charAt(i);
			}
			reversedStr += reversedWord + " ";
		}

		System.out.println(reversedStr.trim());

		// using stream
		
		String reversedStr2 = Stream.of(words).map((word) -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(reversedStr2);
	}

}