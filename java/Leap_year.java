import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        if (n % 400 == 0) {
            System.out.println("Leap year : ");
        } else if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("Leap year : ");
        } else {
            System.out.println(" Not Leap year : ");
        }
    }

}
