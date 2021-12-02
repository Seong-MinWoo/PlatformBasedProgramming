import java.util.Scanner;
public class FactorialMain {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Factorial of " + i + " = " + getFactorial(i));
        }
        scanner.close();
    }

    private static long getFactorial(final int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k = k * i;
        }
        return k;
    }
}
