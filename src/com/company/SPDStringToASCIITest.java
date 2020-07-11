package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

class SPDStringToASCIITest {

	@Test
	void sumElementsSet () {
		Set<Integer> testSet = new HashSet<>();
		testSet.add(74);
		testSet.add(10);
		int result = SPDStringToASCII.sumElementsSet(testSet);
		Assert.assertEquals(result, 84);
	}

	@Test
	void stToASCII () {
		int x = SPDStringToASCII.stToASCII("j");
		Assert.assertEquals(x,74);
	}

	@Test
	void stToASCII2 () {
		int x = SPDStringToASCII.stToASCII("SPD-University");
		Assert.assertEquals(x,34);
	}
}