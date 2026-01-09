import java.util.*;
public class GOLDBACH
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("ENTER NO:");
        int num=sc.nextInt();
        
        int c=0;
        int p=0;
       
        if(num%2==0)
            {
            for(int i=3;i<=num/2;i++)
          
            {
                for(int j=num-i;j>0;j--)
           
                {           
                    if(i%2!=0 && j%2!=0)
            
                    {
              
                        for(int k=2;k<=i;k++)
                    {        if(i%k==0)
                        {
                            c++;
                        }   
                    }
                      for(int m=2;m<=j;m++)
                    {
                        
                       if(j%m==0)
                       {
                           p++;
                       }
                    }
                    if(c==1 && p==1 && i+j==num)
                    {
                        System.out.println(i+","+j);
                    }
                    c = 0;
                    p = 0;
                  }
                }
              }
            }
                else
        {
            System.out.println("no is odd");
        }
              }
                    }
        