package Codes.StringBuilder;

public class Palindrome {
    public  static  void main (String args[])
    {
        String a = "MADAM";
        String sb = new StringBuilder(a).reverse().toString();
        if(a.equals(sb))
        {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It's not a palindrome");
        }

    }
}
