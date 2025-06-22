package Codes.String;

public class DigitOnly {
    public static  void main(String args[])
    {
        String a = "1234 ";
        System.out.println(isDigitOnly(a));
    }

    private static boolean isDigitOnly(String a) {
        if(a.isEmpty() || a == null)
            return false;
        for(int i =0;i<a.length();i++)
        {
            if(!Character.isDigit(a.charAt(i)))
                return  false;
        }
        return true;
    }
}
