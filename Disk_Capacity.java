import java.util.*;
public class capacity
{
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    int t,s,b;
    t=sc.nextInt();
    s=sc.nextInt();
    b=sc.nextInt();
    int r=2*s*t*b*512;
    System.out.println(r);
    }
}