import java.util.*;
public class Transpose 
{
    public static void main(String args[])
    {
        int i,x,j,y;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of rows of array");
        x=obj.nextInt();
        System.out.println("Enter the no of coloumns of array");
        y=obj.nextInt();
        int[][] n=new int[x][y];
        int[][] t=new int[y][x];
        System.out.println("Enter the elements");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
               n[i][j]=obj.nextInt();
            }
        }
        
        for(i=0;i<y;i++)
        {
            for(j=0;j<x;j++)
            {
                t[i][j]=n[j][i];
            }
        }
        System.out.println("The transpose of the given matrix is:");
        for(i=0;i<y;i++)
        {
            for(j=0;j<x;j++)
            {
                System.out.print(t[i][j]+"\t"); 
            }
            System.out.print("\n"); 
        }
        
    }
    
}
