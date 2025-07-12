package Codes.Basic;


import java.util.HashSet;

class LongestConsective {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        int longest = 0;
        for (int num : set) {
            // Only start counting if this is the start of a sequence
            if(!set.contains(num-1)) {
                int currentNum = num;
                int count = 1;
                while(set.contains(currentNum+1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {

        int[] nums1 = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums1)); // Output: 4

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums2)); // Output: 9

        int[] nums3 = {1,0,1,2};
        System.out.println(longestConsecutive(nums3)); // Output: 3
    }
}
