package com.iranna;

import java.util.Arrays;
import java.util.List;

public class UpperLowerCase {
public static void main(String[] args) {
	List<String> words = Arrays.asList("Apple","Orange","Banana","Pineapple");
	List<String> uppserCase = words.stream().map((w)->w.toUpperCase()).toList();
	System.out.println(uppserCase);
	List<String> lowerCase = words.stream().map((w)->w.toLowerCase()).toList();
	System.out.println(lowerCase);
}
	
}
