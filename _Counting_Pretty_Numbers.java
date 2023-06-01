import java.util.*;
public class count
{
    public static void main(String args[])
    {
    int n;
    Scanner sc= new Scanner(System.in);
    n= sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        int l,u,c=0,r;
        l=sc.nextInt();
        u=sc.nextInt();
        for( int j=l;j<=u;j++)
        {
            r=j%10;
            if(r==2 || r==3 || r==9)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
}