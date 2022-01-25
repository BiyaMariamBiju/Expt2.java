import java.util.*;
public class Creplace 
{
    public static void main(String args[])
    {
        int i,flag=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=obj.nextLine();
        int len=str.length();
        System.out.println("Enter the char to be entered :");
        char c=obj.next().charAt(0);
        System.out.println("Enter the position where the char has to be entered :");
        int k=obj.nextInt();
        for(i=0;i<len;i++)
        {
             
            if(i==k-1)
            {
                System.out.print(c); 
                continue;
            }
            System.out.print(str.charAt(i));
        }
        
        
       
    }
}
