package Codes.Basic;


//Group Anagrams
//Function: List<List<String>> groupAnagrams(String[] strs)
//Example: Input: ["eat", "tea", "tan"] → Output: [["eat","tea"], ["tan"]]

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key))
            {

                map.put(key,new ArrayList<>());
            }

            map.get(key).add(s);
        }
       return new ArrayList<>(map.values());
    }

        public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan"}));
        // Output: [["eat","tea"], ["tan"]]

        System.out.println(groupAnagrams(new String[]{"abc", "cab", "bac", "xyz"}));
        // Output: [["abc","cab","bac"], ["xyz"]]

        System.out.println(groupAnagrams(new String[]{})); // Output: []

        System.out.println(groupAnagrams(null)); // Output: []
    }
}
