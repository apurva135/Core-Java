package Codes.Basic;

//Check for Duplicates
//Function: boolean hasDuplicates(int[] arr)
//Example: Input: [1,2,3,1] → Output: true

import java.util.HashSet;

public class Duplicate {

    public  static  boolean hasDuplicates(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                return true;
            }
            else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int[] input = {1, 2, 3, 1};
        System.out.println(hasDuplicates(input));  // Output: true

        int[] input2 = {1, 2, 3, 4};
        System.out.println(hasDuplicates(input2)); //
    }
}
