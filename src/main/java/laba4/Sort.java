package laba4;

public class Sort
{

public Sort ()
	{
	int[] b;
		String str;
		String str2;
		CreateArray createArray = new CreateArray();
		b = createArray.array();
		str2 = makeAnswer(b);
		b = bubbleSorter(b);
		str = makeAnswer(b);
		Info infoFrame = new Info();
		infoFrame.showData("Дано: " + str2 + ". После сортировки: " + str);
	}

	private int[] toSwap(int f, int s, int[] b)
	{
		int[] a = b;
		int d = a[f];
		a[f] = a[s];
		a[s] = d;

		return a;
	}

			public int[] bubbleSorter(int[]a)
		{
			for (int out = 4; out >= 0; out--)
		{
			for (int in = 0; in < out; in++)
		{
			if(a[in] > a[in + 1])
		{
			toSwap(in, in + 1, a);
		}
	}
}

	return a;
		}

			public String makeAnswer(int[]a)
		{
				String s = "";

				for ( int i = 0; i <=4 ; i ++)
		{
					s = s + a[i] + " ";
		}

	return s;
		}
}