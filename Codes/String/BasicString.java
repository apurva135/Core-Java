package Codes.String;

public class BasicString
{
    public static void main(String args[])
    {
        String a = "Ram";
        String b = new String("Ram");
        String c = new String(a);
        String d = "Ram";
        System.out.println(a==b); // false 
        System.out.println(a==c);  // false
        System.out.println(a==d);   // true
        System.out.println(b==c);   // false
        System.out.println(c==d);   // false 
        
    }


}
    


