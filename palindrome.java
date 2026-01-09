import java.util.*;
class palindrome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int p=str.length();
        String rev= "";
        for(int i=p-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev= rev+ch;
        }
        System.out.println(rev);
            if(rev.equals(str))
            {
                System.out.println("It is a palindrome string");
            }
            else
            {
                System.out.println("It is not a palindrome number");
            }
        }
    }