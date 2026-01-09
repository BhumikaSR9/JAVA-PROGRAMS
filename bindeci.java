import java.util.*;
public class bindeci
{public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BINARY NO");
        int bin=sc.nextInt(); 
        double b=0.0d;
        int sum=0;
       String str=String.valueOf(bin);
       int len=str.length();
        for(int i=0;i<len;i++)
        {b=((bin%10)*(Math.pow(2,i)));
            bin=bin/10;
            sum+=b;}
           System.out.print("DECIMAL NO= "+sum);
                  }        
    }