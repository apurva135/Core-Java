package Codes.Basic;

//Reverse String In‑Place
//Function: String reverse(String s)
//Example: Input: "hello" → Output: "olleh"

import java.util.Arrays;

public class ReverseString {

    public static String reverse(String s)
    {
        if(s ==null || s.length() == 0)
        {
            return  "";
        }
          char[] c = s.toCharArray();
          int left = 0;
          int right =  c.length-1;
          while (left < right)
          {
              char temp = c[left];
              c[left] = c[right];
              c[right] = temp;
              right --;
              left ++;

          }
          return new String(c);

    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));  // Output: "olleh"
        System.out.println(reverse("racecar")); // Output: "racecar"
        System.out.println(reverse("a"));       // Output: "a"
        System.out.println(reverse(""));        // Output: ""
    }

}
