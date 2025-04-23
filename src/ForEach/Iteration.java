package ForEach;

public class Iteration {

    public static void printAll(int[] array)
    {
        for(int val : array)
        {
            System.out.print( val + " ");
        }
    }

    public static void findMax(int[] array)
    {
        int max = array[0];

        for(int maxVal : array)
        {
            if(maxVal > max )
            {
                max = maxVal;

            }
        }
        System.out.println( "\nMax value "+ max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7};
        printAll(arr);
        findMax(arr);
    }
}
