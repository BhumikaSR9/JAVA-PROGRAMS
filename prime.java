import java.util.*;
public class prime
{static int c =0;
    public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int no=sc.nextInt();
        int i=2;
        int j =check(no, i);
        if(j>=1)
            System.out.println("No. is not prime");
        else
            System.out.println("prime");}

    static int check(int no, int i)
    {
        if(i==no/2)
            return c;
        if(no%i==0)
           { c++;
               return c;}
        else
            check(no, i+1);
        return c;
    }
}

