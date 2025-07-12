package Codes.Basic;

//Second Highest Distinct Number
//Function: int secondHighest(int[] arr)
//Example: Input: [5,5,4,3] → Output: 4

public class SecondHighest {

    public static int secondHighest(int[] arr) {
        if (arr == null || arr.length < 2) return Integer.MIN_VALUE;
        Integer max = null;
        Integer secondMax = null;
        for(int a : arr)
        {
            if(max ==null || a > max )
            {
                secondMax = max;
                max = a ;
            } else if (a != max && (secondMax == null || secondMax < a))
            {
                secondMax = a;
            }
        }

        return  secondMax == null ? Integer.MIN_VALUE :secondMax;

    }

        public static void main(String[] args) {
        System.out.println(secondHighest(new int[]{5, 5, 4, 3}));    // Output: 4
        System.out.println(secondHighest(new int[]{1, 1, 1}));       // Output: Integer.MIN_VALUE (no second distinct)
        System.out.println(secondHighest(new int[]{2, 1}));          // Output: 1
        System.out.println(secondHighest(new int[]{3}));             // Output: Integer.MIN_VALUE
        System.out.println(secondHighest(new int[]{}));              // Output: Integer.MIN_VALUE
        System.out.println(secondHighest(new int[]{4, 4, 5, 6, 6})); // Output: 5
        System.out.println(secondHighest(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE})); // Output: Integer.MIN_VALUE
    }
}
