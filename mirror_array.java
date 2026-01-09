import java.util.*;
public class mirror_array
{public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows ");
        int m=sc.nextInt();
        System.out.println("Enter columns ");
        int n=sc.nextInt();
        int i,j=0;
        int a[][]=new int[m][n];
        System.out.println("enter elements of array");
        for(i=0;i<m;i++)
        {for(j=0;j<n;j++)
            {System.out.print(i+","+j+"=");
                a[i][j]=sc.nextInt();
            }System.out.println();}
        for(i=0;i<m;i++)
        {for(j=0;j<n;j++)
            {System.out.print(a[i][j]+" ");
            }System.out.println();}
        System.out.println("mirror array");
        for(i=0;i<m;i++)
        {for(j=n-1;j>=0;j--)
            {System.out.print(a[i][j]+" ");
            }
            System.out.println();}}}