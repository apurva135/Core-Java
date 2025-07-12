package Codes.Basic;

//**First Non‑Repeating Character**
//Function: char firstNonRepeating(String s)
//Example: Input: "swiss" → Output: 'w'

import java.util.HashMap;

public class NonRepeatingCharacter {

    public static char firstNonRepeating(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c : s.toCharArray())
        {
            if(map.get(c)==1)
            {
               return c;
            }
        }
        return '\0';
    }
    public static void main(String args[])
    {
        String s = "swiss";
       System.out.println(firstNonRepeating(s));

    }
}
