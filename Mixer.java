import java.util.*;
public class Mixer 
{int arr[];
    int n;
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()
    {Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ELEMENTS OF ARRAY");
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();    
        }}
        Mixer mix(Mixer A)
        {
         Mixer temp=new Mixer(n+A.n);
         int i=0;
         for(;i<n;i++)
         { temp.arr[i]=arr[i];}
            for(int j=i,k=0;k<A.n;k++,j++)
            {
                temp.arr[j]=A.arr[k];
            }return temp;}
              
        void display()        
       {System.out.println("merged array");
           
           for(int i=0;i<n;i++)
         {  System.out.println(arr[i]);
        }      }
        public static void main()
{
    Mixer obj1=new Mixer(3);
    Mixer obj2=new Mixer(5);
    obj1.accept();
    obj2.accept();
    Mixer obj3=obj1.mix(obj2);
    obj3.display();
    
}}
