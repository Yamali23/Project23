package laba4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest
{

		@Test
		public void bubbleSorter()
		{
		Sort sort = new Sort();
		CreateArray createArray = new CreateArray();

		int[] b = createArray.array();
		b = sort.bubbleSorter(b);

			for ( int i = 0; i < b.length - 1; i++)
		{
			assertTrue(b[i] <= b [i+1]);

		}
	}
}