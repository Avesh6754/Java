import java.util.Scanner;
class Sum
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = input.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.print("Sum "+sum);
       }
}
