import java.util.Scanner;

public class PrimeNumber {
       public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the value");
//        int n = scanner.nextInt();
          int n=28;
        boolean flag = false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag!=false) {
            System.out.println(n + "   is prime number");
        } else {
            System.out.println(n + "  is not a prime number");
        }
    }
}
