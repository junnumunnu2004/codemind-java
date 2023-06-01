import java.util.*;
public class numbers
{
    public static void main(String args[])
    {
        int a,s=0 ;
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        for(int i=1;i<=a;i++)
        {
          s=s+i;  
        }
        System.out.println(s);
    }
}