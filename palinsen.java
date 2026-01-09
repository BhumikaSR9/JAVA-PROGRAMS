import java.util.*;

public class palinsen
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER SENTENCE");
        String sen=sc.nextInt();
        
        StringTokenizer st=new StringTokenizer(sen);
        
        boolean valid;
        if(sen.endsWith('!'||'?'||'.')==true)
        {int character=sen.length(0);
            
        