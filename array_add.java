import java.util.*;

public class array_add
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER SIZE OF ARRAY:");
        int s=sc.nextInt();
        
        int a1[]=new int[s];
        int a2[]=new int[s];
        
        System.out.println("ENTER ELEMENTS OF ARRAY1:");
        for(int i=0;i<s;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("ENTER ELEMENTS OF ARRAY2:");
        for(int i=0;i<s;i++)
        {
            a2[i]=sc.nextInt();
        }
        
        System.out.println(" ARRAY1:");
        for(int i=0;i<s;i++)
        {
            System.out.println(a1[i]);
        }
        System.out.println(" ARRAY2:");
        for(int i=0;i<s;i++)
        {
            System.out.println(a2[i]);
        }
        
        System.out.println("SUM OF ELEMENTS OF ARRAY1 AND ARRAY2:");
        
        for(int i=0;i<s;i++)
        {
            System.out.println(a1[i]+a2[i]);
        }
        
    }
}