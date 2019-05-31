package Tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Tools.Vector;

class VectorTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(3);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[3];
		expectedValue[0]=999;
		// Step 3. Obtain the actual value
		int[] actualValue = testedVector.insertElement(999, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSearchElementbyPosition() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(3);
		// Step 2. Create the expected value variable
		int expectedValue = 999;
		testedVector.insertElement(expectedValue, 2);
		// Step 3. Obtain the actual value
		int actualValue = testedVector.searchElementbyPosition(2);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);		
	}
	
	@Test
	void testSearchElementbyValue() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(3);
		// Step 2. Create the expected value variable
		int expectedValue = 2;
		testedVector.insertElement(300, 2);
		// Step 3. Obtain the actual value
		int actualValue = testedVector.searchElementbyValue(300);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);		
	}
	
	@Test
	void testListElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(3);
		// Step 2. Create the expected value variable
		String expectedValue = "0 0 300";
		// Step 3. Obtain the actual value
		int[] oldValue = testedVector.insertElement(300, 2);
		String actualValue = testedVector.listElement(oldValue);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testUpdatetElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(3);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[3];
		expectedValue[2] = 555;
		// Step 3. Obtain the actual value
		testedVector.insertElement(300, 2);
		int[] actualValue = testedVector.updateElement(555,2);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testDeletetElement() {
		// Step 1. instantiate the tested class using the constructor method
		Vector testedVector = new Vector(3);
		// Step 2. Create the expected value variable
		int[] expectedValue = new int[3];
		expectedValue[1] = 0;
		// Step 3. Obtain the actual value
		testedVector.insertElement(125, 1);
		int[] actualValue = testedVector.deleteElement(125);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}
	
}
