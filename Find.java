import java.util.*;
public class Find 
{
    public static void main(String args[])
    {
        int i,flag=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String");
        String str=obj.nextLine();
        String str1=str.toLowerCase();
        System.out.println("Enter the character to be checked in lower case");
        char c=obj.next().charAt(0);
        int len=str.length();
        for(i=len-1;i>=0;i--)
        {
            
            if(str1.charAt(i)==c)
            {
              flag=1;
              break;
            }
        }
        
       if(flag==0)
       {
        System.out.println("char is not found");
       }
       else
       {
        System.out.println("char is found at position:"+(i+1));
       }
    }  
}
