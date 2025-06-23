package Codes.String;

//Find First Non-Repeating Character

public class FirstUniqueChar {
    public static void main(String args[])
    {
        String a = "AAppurvaaaaa";
        char b = firstUnique(a);
        if(b != 0)
        {
            System.out.println(b);
        }
        else {
            System.out.println("No Unique Char");
        }

    }

    private static char firstUnique(String a) {
        int[] count = new int[256];
        for(int i =0;i<a.length();i++)
        {
            count[a.charAt(i)]++;
        }
        for(int i =0;i<a.length();i++)
        {
            if(count[a.charAt(i)] == 1)
            {
                return a.charAt(i);
            }
        }
        return  0;
    }
}
