package Codes.Arrays;

//Check if an array is sorted (ascending/descending)

public class CheckOrdering {
    public static void main(String args[])
    {
        int[] arr = {88,89,90,914,1000};
        boolean asc = true;
        boolean desc = true;

        for(int i =0;i<arr.length-1;i++)
        {
            if (arr[i]> arr[i+1])
            {
                asc = false;
            }
            if(arr[i]<arr[i+1])
            { desc = false; }

            if( !asc && !desc)
            {
                System.out.println("Array is not sorted ");
                return;
            }
        }

        if(asc)
        {
            System.out.println("Array is sorted in ascending");
        }
        else
        {
                 System.out.println("Array is sorted in descending order");
        }

    }
}
