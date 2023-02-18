//5. WAP to implement Anagram checking least inbuilt method being used
import java.util.Arrays;
public class Q5 {

    public static void main(String[] args) {

        String str1 = "keep";
        String str2 = "peek";

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Given Strings are anagram");
        }
        else
        {
            System.out.println("Given Strings are not anagram");

        }





    }
}
