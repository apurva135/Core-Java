package Codes.String;

public class Anagrams {
    public static void main(String args[])
    {
        String a = "listen";
        String b = "Silent";
        if (areAnagrams(a, b)) {
            System.out.println("Anagrams ");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    private static boolean areAnagrams(String a, String b) {
        if(a.length() != b.length()) return  false;

        int[] count = new int[26];
        a = a.toLowerCase();
        b = b.toLowerCase();

        for(int i =0;i<a.length();i++)
        {
             count[a.charAt(i) -'a'] ++;
             count[b.charAt(i) - 'a'] --;
        }
        for(int i : count)
        {
            if(i != 0)
                return false;
        }
        return true;

    }
}
