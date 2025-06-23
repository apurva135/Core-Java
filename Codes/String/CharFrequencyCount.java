package Codes.String;

// Count the Occurrence of Each Character

public class CharFrequencyCount {
    public static void main(String args[])
    {
        String a = "Apurvaaa";
        int[] freq = new int[256];
        for(int i = 0;i<a.length();i++)
        {
            freq[a.charAt(i)] ++;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i] > 0)
            {
                System.out.println((char) i + " " + freq[i]);
            }
        }

        // maintain insertion order

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (freq[ch] > 0) {
                System.out.println(ch + " " + freq[ch]);
                freq[ch] = 0; // prevent printing duplicates
            }
        }

    }
}
