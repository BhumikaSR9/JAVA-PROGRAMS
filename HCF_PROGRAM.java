import java.util.*;
public class HCF_PROGRAM
{
   // static int nl,ns,i;
    static int calc(int nl,int ns,int n)
    {
      
        if(nl%n==0 && ns%n==0)
        {
            return n;
        }
        else
        {
            return calc( nl,ns,n-1);
            
        }}

    public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("enter m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i=0; 
        int ns=Math.min(m,n);
    
        System.out.println(calc( m,n,ns));   }}