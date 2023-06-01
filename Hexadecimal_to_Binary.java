import java.util.*;
public class hexa
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int t, c;
         String s;
         t= sc.nextInt();
         sc.nextLine();
         while(t-->0)
         {
             s= sc.nextLine();
             s=s.toUpperCase();
             c=Integer.parseInt(s,16);
             String s1=Integer.toBinaryString(c);
             if(s1.length()%4==0)
             System.out.println(s1);
             else
             {
                 int k=s1.length()%4;
                 for(int i=0;i<4-k;i++)
                 System.out.print("0");
                 System.out.println(s1);
             }
         }
    }
}