package laba4;

public class CreateArray
{

	public int[] array()
	{

		RandomNumber number = new RandomNumber();

		int[] a = new int[5];
		a[0] = number.rand();
		a[1] = number.rand();
		a[2] = number.rand();
		a[3] = number.rand();
		a[4] = number.rand();

		return a;
	}
}