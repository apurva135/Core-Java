package Codes.Basic;

//Count Character Frequency
//Function: Map<Character,Integer> freqMap(String s)
//Example: Input: "aabbc" → Output: {a=2, b=2, c=1}

import java.util.HashMap;
import java.util.Map;

public class CharacterFreqeuncy {

    public static Map<Character, Integer> freqMap(String s) {

        HashMap<Character , Integer> map = new HashMap<>();
        if(s == null || s.isEmpty()) return map;
        for(char c : s.toCharArray())
        {
                map.put(c,map.getOrDefault(c,0)+1);
        }
    return map;
    }
    public static void main(String[] args) {
        System.out.println(freqMap("aabbc"));   // Output: {a=2, b=2, c=1}
        System.out.println(freqMap("banana"));  // Output: {b=1, a=3, n=2}
        System.out.println(freqMap(""));        // Output: {}
        System.out.println(freqMap(null));      // Output: {}
        System.out.println(freqMap("aAa"));     // Output: {a=2, A=1}
    }

    }
