import java.util.*;
public class EqMat
{
    static Scanner sc=new Scanner(System.in);
    int a[][];
    int m;
    int n;

    EqMat(int mm,int nn)
    {
        
        m=mm;
        n=nn;
        a = new int[m][n];
    }

    void readarray()
    {
        System.out.println("Enter elements of array");

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(i + "'" + j);
                a[0][0]=sc.nextInt();
            }
        }
    }
    static int check(EqMat P,EqMat Q)
    {
        int i,j,f = 1;
        if(P.m!=Q.m && P.n!=Q.n)
        {
            f=0;
        }
        else
        {
            for(i=0;i<P.m;i++)
            {
                for(j=0;j<Q.n;j++)
                {
                    if(P.a[i][j]!=Q.a[i][j])
                    {
                        f=0;
                        break;
                    }
                }
            }
        }
        return f;
    }
    
    public static void main()
    {
        System.out.println("enter rows and columns of array:");
        int a1=sc.nextInt();
        int b1=sc.nextInt();

        System.out.println("enter rows and columns of array2");
        int a2=sc.nextInt();
        int b2=sc.nextInt();

        EqMat P=new EqMat(a1,b1);
        EqMat Q=new EqMat(a2,b2);

        P.readarray();
        Q.readarray();
        int k = check(P,Q);
        if(k==0)
        {
            System.out.println("ARRAY NOT EQUAL");
        }
        else
        {
            System.out.println("Array equal");
        }
    }
}