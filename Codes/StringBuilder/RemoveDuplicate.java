package Codes.StringBuilder;

import java.util.HashSet;
import java.util.Set;

//Remove Duplicate Characters from a String

public class RemoveDuplicate {
    public static void main(String args[])
    {
        String a ="Apurvaaaa";
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for(char c: a.toCharArray() )
        {
            if(!seen.contains(c))
            {
                result.append(c);
                seen.add(c);
            }
        }
        System.out.println("Original " + a);
        System.out.println("Without Duplicate " + result.toString());




    }
}
