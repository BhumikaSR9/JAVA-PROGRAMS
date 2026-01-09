import java.util.*;
public class fibo
{Scanner sc=new Scanner(System.in);
    int i;
    int n;
    int sum;
    fibo()
    { i=0;
        n=0;
        sum=0;}

    void accept()
    {System.out.println("enter ending limit");
        n=sc.nextInt();
    }

    void series()
    {for(i=1;i<n;i++)
        {System.out.println(sum);
            sum+=i;
        }}

    public static void main()
    {

        fibo obj=new fibo();
        obj.accept();
        obj.series();
    }
}