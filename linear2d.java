import java.util.*;
public class linear2d
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("enter rows of array");
        int r=sc.nextInt();
        
        System.out.println("enter column of array");
        int c=sc.nextInt();
       
        int arr[][]=new int[r][c];
       
       
        int i,j=0;
        System.out.println("enter elements of aray");
       int m=0,n=0;
        for(i=0;i<r;i++)
          {
              for(j=0;j<c;j++)
          { 
              arr[i][j]=sc.nextInt();}
               }
              System.out.println("enter no to be searched");
        int s=sc.nextInt();
             
               System.out.println("elements of array");
                 
               for(i=0;i<r;i++)
          {
              for(j=0;j<c;j++)
              
              {
                  System.out.print("  "+arr[i][j]+"  ");
                }
               System.out.println();
            }
        int e=0;
               for(i=0;i<r;i++) {
              for(j=0;j<c;j++)
              
              {
                 if(arr[i][j]==s)
                   {
                       e++;
                       m=i;
                       n=j;
                       break;
                    }
                
            }}
            if(e==1)
                    {
                        System.out.println(s+" is found at "+m+","+n+" index");
                    }
                    else
                    {
                        System.out.println("element not found");
                        
                    } 
                }}
                                  