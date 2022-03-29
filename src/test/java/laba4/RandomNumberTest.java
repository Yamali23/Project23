package laba4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomNumberTest {

	 @Test
	    public void rand() {

	         
		     RandomNumber randomNumber = new RandomNumber();
	         int actual = randomNumber.rand();
	         int expectedOne = 100;
	         int expectedTwo = 200;
	         assertTrue(expectedOne <= actual);
	         assertTrue(expectedTwo >= actual);
	    }
}
