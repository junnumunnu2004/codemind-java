import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        double sum = calculateHarmonicProgressionSum(N);
        System.out.format("%.2f",sum);
    }

    private static double calculateHarmonicProgressionSum(int N) {
        double sum = 0;
        int a = 1;
        int d = 1; 

        for (int i = 1; i <= N; i++) {
            double term = 1.0 / (a + (i - 1) * d);
            sum += term;
        }

        return sum;
    }
}
