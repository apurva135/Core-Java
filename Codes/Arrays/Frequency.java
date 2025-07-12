package Codes.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args)
    {
        int[] arr = {12,34,55,66,66,23,45,67,89};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr)
        {
            map.put(i, map.getOrDefault(i,0) +1);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
