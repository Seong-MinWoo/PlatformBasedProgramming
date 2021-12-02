import java.util.Scanner;
public class MathMain {
    public static void main(String[] args) {
        int begin, end;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a begin number: ");
        begin = scanner.nextInt();
        System.out.print("Enter an end number: ");
        end = scanner.nextInt();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);

    }

    private static long getSumBetween(final int begin, final int end) {
        int sum = 0;
        for (int i=begin; i<=end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static long getProductBetween(final int begin, final int end) {
        int product = 1;
        for (int i=begin; i<=end; i++) {
            product = product * i;
        }
        return product;
    }
}
