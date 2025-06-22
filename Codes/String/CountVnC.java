package Codes.String;

public class CountVnC {
    public static void main(String args[])
    {
        String a = "Apurva";
        int vowels =0 ;
        int consonants =0;
        a = a.toLowerCase();
        for(int i = 0;i<a.length();i++ )
        {
            char ch = a.charAt(i);
            if(ch>='a' && ch<='z' )
            {
               if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    vowels++;
                }
            else{
                    consonants++;
                }
            }

        }
        System.out.println("Vowels Count " + vowels);
        System.out.println("Consonants Count " + consonants);

    }
}
