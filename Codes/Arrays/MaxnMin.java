package Codes.Arrays;

// Find the maximum and minimum element in an array

public class MaxnMin {
    public static  void main(String args[])
    {
        int[] arr = {12,2,3,4,5,6,6,7,7,7,88,77,65,3};
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr)
        {
            if(num > max)
            {
                max = num ;
            }
            if(num < min)
            {
                min = num ;
            }
        }
        System.out.println("max " + max+ " " + "min " + min);
    }
}
