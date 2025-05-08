package ControlFlow.ForEach;

import java.util.ArrayList;

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

        for(int Val : array)
        {
            if(Val > max )
            {
                max = Val;

            }
        }
        System.out.println( "\nMax value "+ max);
    }

    public static void arrayList(ArrayList<Integer> array)
    {
        int min = Integer.MIN_VALUE; //minimum integer value;

        for(int value : array) // all element of array or collection
        {
            if(value > min) // check current value is grater than min value;
            {
                min = value; //update min value
            }
        }
        System.out.println(min+ " max");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7};
        printAll(arr);
        findMax(arr);

        ArrayList<Integer> arrL =  new ArrayList<>();
        arrL.add(5);
        arrL.add(6);
        arrL.add(8);
        arrL.add(10);
        arrayList(arrL);
    }
}
