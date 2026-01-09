import java.util.*;
public class factors
{ static int i;
static void faccal(int no,int i)
{if(i<=no)
   { if(no%i==0)
    { System.out.println(i);
         faccal(no,i+1);
    }else
    {
      faccal(no,i+1);
    }    
   }
}
   
public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NO:");
        int no=sc.nextInt();
        int fact=0;
    int i=1;
faccal(no, i);}}