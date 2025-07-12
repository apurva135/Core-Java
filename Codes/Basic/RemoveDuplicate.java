package Codes.Basic;
//
//Remove Duplicates In‑Place from Sorted Array
//Function: int removeDuplicates(int[] nums)
//Example: Input: [1,1,2] → Output: New length 2, array [1,2,...]

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int k = 1;
        for (int i =1;i<nums.length-1;i++)
        {
            if(nums[i] != nums[i+1])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int newLength = removeDuplicates(nums);
        System.out.println(newLength); // Output: 2
        // Print only unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " "); // Output: 1 2
        }

        System.out.println();
        int[] nums2 = {1, 1, 1, 2, 2, 3};
        newLength = removeDuplicates(nums2);
        System.out.println(newLength); // Output: 3
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums2[i] + " "); // Output: 1 2 3
        }
    }

}

