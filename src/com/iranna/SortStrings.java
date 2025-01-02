package com.iranna;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorting list of Strings in asc & desc order
public class SortStrings {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Mango","Apple","Orange","Kiwi","Dragon Fruit");
		List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());
		List<String> descWords = words.stream().sorted(Comparator.reverseOrder()).toList();
	   System.out.println(sortedWords);
	   System.out.println(descWords);
	}
	
}
