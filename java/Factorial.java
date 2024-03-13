import java.util.Scanner;
class Factorial
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = input.nextInt();
        int sum=1;
        for(int i=a;i>=1;i--)
        {
            sum=sum*i;
        }
        System.out.print("Sum "+sum);
        
        
    }
}
