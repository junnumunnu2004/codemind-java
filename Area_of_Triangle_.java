import java.io.*;
import java.util.*;
public class herons {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        double s=(a+b+c)/2.0;
        double h=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",h);
    }
}