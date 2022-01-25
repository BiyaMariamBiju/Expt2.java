import java.util.*;
public class Spalindome 
{
    public static void main(String args[])
    {
        int i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String");
        String str=obj.nextLine();
        String rev="";
        int len=str.length();
        for(i=len-1;i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
        if(str.toLowerCase()==rev.toLowerCase())
        {
          System.out.println("Pallindrome");
        }
        else
        {
          System.out.println("Not Pallindrome");
        }
    }
}
    

