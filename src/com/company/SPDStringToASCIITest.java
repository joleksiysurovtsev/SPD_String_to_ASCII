package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

class SPDStringToASCIITest {

	@Test
	void sumASCIICharArray () {
		Set<Integer> testSet = new HashSet<>();
		testSet.add(74);
		testSet.add(10);
		int result = SPDStringToASCII.sumASCIICharArray(testSet);
		Assert.assertEquals(result, 84);
	}

	@Test
	void stToASCII () {
		int x = SPDStringToASCII.stToASCII("J");
		Assert.assertEquals(x,74);
	}
}