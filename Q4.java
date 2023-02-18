//4. WAP to count the number of consonants, vowels , special characters in a string
public class Q4 {
    public static void main(String[] args) {

        String str = "@mbadas" ;

        int consonants=0 ;
        int vowels=0  ;
        int special_char=0;

        for(int i=0; i<str.length() ; i++)
        {
             if(str.charAt(i)== 97 || str.charAt(i)== 101 || str.charAt(i)== 105 || str.charAt(i)== 111 || str.charAt(i)== 117  )
             {
                 vowels++;
             }
             else if ( str.charAt(i)>96 && str.charAt(i)< 123)
            {
                consonants++;
            }
             else if(str.charAt(i)>=33 && str.charAt(i)<=64)
             {
                 special_char++;
             }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(special_char);

    }
}
