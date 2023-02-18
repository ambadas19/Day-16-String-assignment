//2.WAP to print Duplicates characters from the String.

public class Q2 {
    public static void main(String argu[])
    {
        String str = "physics wallah";
        char ch[] = str.toCharArray();

        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in  string are: ");

        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i + 1; j < str.length(); j++)
            {
                if (ch[i] == ch[j]) {
                    System.out.print(ch[j] + " ");
                    break;
                }
            }
        }
    }
}
