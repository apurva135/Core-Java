package Codes.Basic;


//Palindrome Checker
//Function: boolean isPalindrome(String s)
//Example: Input: "racecar" → Output: true

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if(s == null)
        {
            return false;
        }
        int left =0, right = s.length()-1;
        while (left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
        public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("level"));   // true
        System.out.println(isPalindrome("hello"));   // false
        System.out.println(isPalindrome(""));        // true (empty string is a palindrome)
        System.out.println(isPalindrome(null));      // false
        System.out.println(isPalindrome("a"));       // true
    }
}
