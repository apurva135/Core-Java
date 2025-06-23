package Codes.StringBuilder;

//Toggle Case of Each Character in a String

public class ToggleCase {
    public static void main(String args[])
    {
        String a = "Apurva";
        String result=togglecase(a);
        System.out.println(result);

    }

    private static String togglecase(String a) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= a.length() - 1; i++)
        {
            if (Character.isUpperCase(a.charAt(i))) {
                res.append(Character.toLowerCase(a.charAt(i)));
            } else if (Character.isLowerCase(a.charAt(i))) {
                res.append(Character.toUpperCase(a.charAt(i)));
            } else {
                res.append(a.charAt(i));
            }
        }
        return res.toString();
    }

}
