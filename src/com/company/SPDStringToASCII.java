package com.company;

import java.util.HashSet;
import java.util.Set;

public class SPDStringToASCII {

	private static int sumASCIICharArray (Set<Integer> sI) {
		return sI.stream().mapToInt(i -> i).sum();
	}

	public static void stToASCII (String value) {
		char[] result = value.toCharArray();
		Set<Integer> evenNumb = new HashSet<>();
		Set<Integer> notEvenNumb = new HashSet<>();

		for (int x : result) {
			if (x % 2 == 0) {
				evenNumb.add(x);
			} else {
				notEvenNumb.add(x);
			}
		}

		int x = sumASCIICharArray(evenNumb);
		int y = sumASCIICharArray(notEvenNumb);

		System.out.println("result in character: " + (char) Math.abs(x - y));
		System.out.println("result in decimal system: " + Math.abs(x - y));

	}
}
