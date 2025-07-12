package Codes.Basic;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReturnDuplicate {
        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();
            Set<Integer> seen = new HashSet<>();
            for (int n : nums) {
                if (seen.contains(n)) {
                    // Add only the first time we find the duplicate
                    if (!result.contains(n)) {
                        result.add(n);
                    }
                } else {
                    seen.add(n);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
            System.out.println(findDuplicates(nums)); // Output: [3, 2]
        }
    }


