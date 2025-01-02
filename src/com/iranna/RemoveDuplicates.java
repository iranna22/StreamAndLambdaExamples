package com.iranna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Remove duplicate elements from the List
public class RemoveDuplicates {
public static void main(String[] args) {
List<Integer> numbers = Arrays.asList(1,2,5,39,8,2,1,4,5);
	  List<Integer> list = numbers.stream().distinct().toList();
	System.out.println(list);
	
	List<String> fruits = Arrays.asList("apple","banana","orange","apple","banana");
	List<String> list2 = fruits.stream().distinct().toList();
	System.out.println(list2);
}
	
}
