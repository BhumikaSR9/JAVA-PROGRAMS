
import java.util.*;

public class calculator
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER ANY TWO NUMBERS:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int op=0;
        
        System.out.println("ENTER 1 FOR ADDITION, 2 FOR SUBTRACTION, 3 FOR MULTIPLICATION AND 4 FOR DIVISION:");
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
            op=n1+n2;
            break;
            
            case 2:
            op=n1-n2;
            break;
            
            case 3:
            op=n1*n2;
            break;
            
            case 4:
            op=n1/n2;
            break;
            
            default:
               
            System.out.println("INVALID CHOICE ENTERED!!");   
                
        }
        System.out.println("RESULT="+op);
        
    }
}