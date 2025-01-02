package com.iranna;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,8,6,12,4);
		List<Integer> list = numbers.stream().filter((n)->n%2==0).collect(Collectors.toList());
		System.out.println(list);
	}
}
