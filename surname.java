import java.util.*;
public class surname
{

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter name:");
        String name=" "+sc.nextLine();
        int len=name.length();
        int li;
        char ch, chb=' ';
        String sb=" ";
      
        li=name.lastIndexOf(' ');
      
        for(int i=0;i<len;i++)
        {
            ch=name.charAt(i);

            if(ch==' '&& i!=li)
            { 
                chb=name.charAt(++i);
                System.out.print((chb)+".");
            }

            if(i==li)
            {  
                sb=name.substring(++i,len);
                System.out.print(sb);
            }
        }
    }
}