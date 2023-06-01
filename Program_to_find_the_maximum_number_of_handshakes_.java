import java.util.*;
public class hand
{
    public static void main(String arrgs[])
    {
        Scanner sc= new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int tn=n*(n-1)/2;
        System.out.print(tn);
    }
}