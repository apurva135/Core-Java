package Codes.Arrays;

public class LinearSearch {
    public static void main(String args[])
    {
        int[] arr = {12,23,45,45,5,5,5,67,78,8,88};
        int target = 23;
        int index = search(arr, target);
        if(index != -1 )
        {
            System.out.println("Element found at " + index);
        }
        else {
            System.out.println("No element found");
        }
    }

    public static int search(int[] arr, int target)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == target)
                return i;
        }
        return  -1;
    }
}
