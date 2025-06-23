package Codes.StringBuilder;

// Replace All Spaces with %20 (URLify)


public class URLify {
    public static void main(String args[])
    {
        String a = "Apurva is super rich";
        String b = urlify(a);
        System.out.println(b);
    }

    private static String urlify(String a) {
        if (a == null || a.isEmpty()) return a;
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<a.length();i++)
        {
            if(a.charAt(i) == ' ')
            {
                sb.append("%20");
            }
            else
                sb.append(a.charAt(i));

        }
        return sb.toString();
    }
}
