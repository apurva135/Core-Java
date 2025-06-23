package Codes.String;


//Check if One String is a Rotation of Another

public class StringRotationCheck {
    public static  void main(String args[])
    {
        String a = "waterbottle";
        String b = "erbottlewatw";
        System.out.println(rotationCheck(a,b));

    }

    private static boolean rotationCheck(String a, String b) {
        if(a == null || b== null || a.isEmpty() || b.isEmpty() || a.length() != b.length())
            return  false;

        String combined = a + a ;


         return combined.contains(b);
    }
}
