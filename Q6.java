//WAP to implement Pangram checking with least inbuilt method being used
//pangram == a sentence or string contaning every letter of the alphabet
public class Q6 {

    public static void main(String[] args) {

        boolean flag = false;
        String str ="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

        str = str.replace(" " , "");//new string object address is given to str

        char ch[] = str.toCharArray();

        int arr[] = new int[26];//by defalault int array get 0 value if not initialize the array

        for(int i=0 ; i<ch.length ; i++)
        {
            arr[ch[i] - 65]++;
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==0)
            {
                System.out.println("Given string is not pangram");
                flag = true;
            }

        }

        if(flag==false)
        {
            System.out.println("Given String is pangram");
        }


    }
}

