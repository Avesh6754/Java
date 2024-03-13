import java.util.Scanner;
class Swap
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = input.nextInt();
        System.out.print("Enter the value of b ");
        int b = input.nextInt();

        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("A = "+a);
        System.out.print("B = "+b);

    }
}
