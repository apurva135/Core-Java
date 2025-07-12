package Codes.Arrays;

public class SumOfElements {
    public static void main(String args[])
    {
        int[] arr = {23,34,56,78,90,67};
        int sum = 0;
        for(int num : arr)
        {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
