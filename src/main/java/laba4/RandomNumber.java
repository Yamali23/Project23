package laba4;

public class RandomNumber
{

    public int rand()
    {
        int a;

        a = 100 + (int)(Math.random() * ((200 - 100) + 1));

        return a;
    }
}