package Codes.Arrays;

public class ReverseArray {

    public static void main(String args[])
    {
        int[] arr = {10, 20, 30, 40, 50};
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
        for(int i : arr)
        {
            System.out.print(i + " ");
        }

    }
}
