import java.util.*;
public class Main {
    public static void word_found(String word, char key)
    {
        char ch;
        for (int i=0;i<word.length()-1;i++)
        {
            ch=word.charAt(i);
            if(ch==key)
            {
                System.out.println("your key has been found"+key);
                break;

            }
            if(ch!=key)
            {


                    System.out.println("your key has not found "+key);
                    break;

            }
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your word-----");
        String word=sc.nextLine();
        System.out.println("Enter your key word that you wanna find---");
        Scanner sc1=new Scanner(System.in);
        char key = sc.next().charAt(0);
        word_found(word,key);
        System.out.println("Hello world!");
    }
}