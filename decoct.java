import java.util.*;
public class decoct
{ public static void main()
    {Scanner sc =new Scanner(System.in);
        System.out.println("Enter decimal no");
        int dec=sc.nextInt();
        String str="";
        int d,r=0;
        while(dec>0)
        {d=dec;
            dec=d/8;
            r=d%8;
            str = r+str;
           
            if(dec==0)
            {break;}}
         System.out.print(str);}}