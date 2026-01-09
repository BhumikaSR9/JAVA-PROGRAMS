import java.util.*;
public class leapyr
{public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int yr=sc.nextInt();
        if(yr%100==0)
        {if(yr%400==0)
            {System.out.println(yr+" is a leap year");
            }
            else
            {System.out.println(yr+"is not a leap year");
            }}
            else
            {if(yr%4==0)
                {System.out.println(yr+" is a leap year");
                }
                else
                {System.out.println(yr+" is not a leap year");
                }
            }
        }}