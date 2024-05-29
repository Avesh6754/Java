import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();
        int sum = 0;
        int i = 0;
        int j = 1;
        while (i <= n) {
            System.out.println(i);
            sum = i + j;
            i = j;
            j = sum;

        }
    }
}
