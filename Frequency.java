import java.util.Scanner;

public class Frequency 
{
    public static void main(String args[])
    {
        int i,flag=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=obj.nextLine();
        String str1=str.toLowerCase();
        int len=str1.length();
        System.out.println("Enter the char whose freq has to be checked in lower case:");
        char c=obj.next().charAt(0);
        for(i=0;i<len;i++)
        {
            if(str1.charAt(i)==c)
            {
                flag++;
            }
        }
        if(flag==0)
        {
            System.out.println("The character is not present");
        }
        else
        {
            System.out.println("The character is present and the frequency of the character is:"+flag);
        }
    }
    
}
