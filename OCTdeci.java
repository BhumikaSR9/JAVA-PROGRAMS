import java.util.*;
public class OCTdeci
{public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("ENTER OCTAL NO");
        int oct=sc.nextInt(); 
        double oc=0.0d;
        int sum=0;
       String str=String.valueOf(oc);
       int len=str.length();
        for(int i=0;i<len;i++)
        {oc=((oct%10)*(Math.pow(8,i)));
            oct=oct/10;
            sum+=oc;}
           System.out.print("DECIMAL NO= "+sum);
                  }        
    }