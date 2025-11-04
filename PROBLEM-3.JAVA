import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        scanner.close();

        int n = (a % 2 == 0) ? a - 1 : a;
        for (int i = 0; i < n; i++) {
            System.out.print(2 * i + 1);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}
