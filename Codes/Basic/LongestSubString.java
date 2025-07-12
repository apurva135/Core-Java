package Codes.Basic;

//Longest Substring Without Repeating Characters
//Function: int lengthOfLongestSubstring(String s)
//Example: Input: "abcabcbb" → Output: 3 ("abc")


import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {

        if(s == null || s.isEmpty())
        {
            return 0;
        }
        if (s.length()==1)
        {
            return  1;
        }

        int left =0, right =0,ans=0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length())
        {
           if(set.contains(s.charAt(right)))
           {
               set.remove(s.charAt(left));
               left ++;
           }
           else {
               set.add(s.charAt(right));
               ans = Math.max(ans, right - left + 1);
               right++;
           }

        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3
        System.out.println(lengthOfLongestSubstring(""));         // Output: 0
        System.out.println(lengthOfLongestSubstring(null));       // Output: 0
        System.out.println(lengthOfLongestSubstring("au"));       // Output: 2
    }



    }
