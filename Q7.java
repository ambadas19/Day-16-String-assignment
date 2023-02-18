//WAP to find if String contains all unique characters.
import java.util.Scanner;
public class Q7 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str= obj.nextLine();

        int unique_character = 0;

        for(int i=0; i<str.length() ; i++)
        {
             if(str.charAt(i)>=33 && str.charAt(i)<=47 || str.charAt(i)>=58 && str.charAt(i)<=64 || str.charAt(i)>=91 && str.charAt(i)<=96 || str.charAt(i)>=123 && str.charAt(i)<=126)
             {
                 unique_character++;
             }

        }

        if(unique_character == str.length())
        {
            System.out.println("Given String contains all unique character");
        }

        else
        {
            System.out.println("Given String not contains all uninue character");
        }




    }
}
