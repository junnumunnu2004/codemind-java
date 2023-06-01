import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int primeCount = countPrimesBetween(m, n);
        System.out.println(primeCount);
    }

    private static int countPrimesBetween(int m, int n) {
        int primeCount = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        return primeCount;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
