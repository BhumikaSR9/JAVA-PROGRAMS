import java.util.*;

public class vowcons
   {
      public static void main()
          { 
              Scanner sc=new Scanner(System.in);
              
              System.out.println("Enter any sentence:");
              String sen=sc.nextLine();
              int len=sen.length();
              String wr=" ";
              String wh;
              char x;
              char scc;
              char lc;
              int lw;
              for(int i=0;i<len;i++)
              {x=sen.charAt(i);
                  wr+=x;
                  if(x==' ')
                  {
                      wh=wr;
                     wh=wh.toLowerCase();
                      scc=wh.charAt(0);
                      lw=wh.length();
                      lc=wh.charAt(lw-1);
                      
                  if((scc=='a' && lc=='a')||(scc=='e' && lc=='e')||(scc=='i' && lc=='i')||(scc=='o' && lc=='o')||(scc=='u' && lc=='u'))
                  {
                      System.out.println(wh);
                    }
                }}}}
                  