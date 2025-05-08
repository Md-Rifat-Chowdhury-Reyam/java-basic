package ControlFlow.ForEach;

public class findingMaxNumber {
    public static int maxNum()
    {
        int[] array = {12,34,454,23,545,22234};
        int max = array[0];

        for(int maxVa : array)
        {
            if (maxVa > max)
            {
                max = maxVa;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxNum());
    }
}
