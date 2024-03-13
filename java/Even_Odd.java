import java.util.Scanner;
class Even_Odd
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = input.nextInt();
        

        if(a%2==0)
        {
            System.out.print("Even number ! ");
        }
        else
        {
            System.out.print("Odd number ! ");
        }
    }
}
