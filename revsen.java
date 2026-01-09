import java.util.*;

public class revsen
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("ENTER SENTENCE");
        String sen=sc.nextLine() + " ";
        
        int len=sen.length();
        int wrlen;
        
        char x,d=' ';
        
        String wr=" ";
        String wh ,rw=" ";
        System.out.print("word= ");
        
        for(int i=0;i<len;i++)
        {
            x=sen.charAt(i);
                       
            if(x==' ')
            
            {
                wh=wr;
                wr=" ";
               // wrlen=wh.length();
                
               /* for(int k=(wrlen-1);k>=0;k--)
                {
                    d=wh.charAt(k);
                    rw+=d;
                }*/
                
                    System.out.print(wh);
                    wh=" ";
                }
                else
                {
                    wr=x+wr;
                    
                }
            }
        }
    }

        
            
            