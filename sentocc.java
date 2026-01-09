import java.util.*;

    
    public class sentocc
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER SENTENCE");
            String sen=sc.nextLine() + " ";
            System.out.println("ENTER WORD TO FIND");
            String wrd=sc.nextLine();
            String ex = "";
            int o = 0;
            int len=sen.length();
            for(int i=0;i<len;i++)
            {
                
                if(sen.charAt(i) ==' ')
                {
                  
                    if (ex.equals(wrd))
                    {
                        o++;
                        ex = "";
                    }
                   else
                    {
                        System.out.print(ex + " ");
                        ex = "";
                    }
                }
                else
                {
                    ex += sen.charAt(i);
                }
        }
        System.out.println();
        System.out.println("Occurence of "+wrd+" is="+o);
        //System.out.println(sen);
        }}