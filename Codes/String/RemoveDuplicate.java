package Codes.String;

public class RemoveDuplicate {
    public static void main(String args[])
    {
        String a = "Apurvaaa";
        String result ="";
        for(int i =0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(result.toLowerCase().indexOf(Character.toLowerCase(ch))==-1)
            {
                result = result + a.charAt(i);
            }
        }
        System.out.println(result);
    }
}


// check stringbuilder version
