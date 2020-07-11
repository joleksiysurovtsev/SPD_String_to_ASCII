package com.company;

import java.util.HashSet;
import java.util.Set;

public class SPDStringToASCII {

	public static int sumASCIICharArray (Set<Integer> sI) {
		return sI.stream().mapToInt(i -> i).sum();
	}

	public static int stToASCII (String value) {
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

		return Math.abs(sumASCIICharArray(evenNumb) - sumASCIICharArray(notEvenNumb));
	}
}
