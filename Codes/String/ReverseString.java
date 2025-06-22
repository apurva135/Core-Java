package Codes.String;

public class ReverseString{
    public static void main(String[] args) {
        String a = "Apurva";
        String rev ="";
        for(int i = a.length()-1;i>=0;i--){
           rev = rev + a.charAt(i);
        }
        System.out.println(rev);
    }
}



//see better version in string builder folder
