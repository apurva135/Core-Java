package Codes.String;

//Check if a String is a Palindrome

public class Palindrome {
    public static void main(String args[])
    {
        String a = "madam";
        String rev = "";
        for(int i = a.length() -1 ; i>=0;i--)
        {
            rev = rev+a.charAt(i);
        }
        if(rev.equals(a))
        {
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
}


// check string builder version