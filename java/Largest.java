import java.util.Scanner;
class Largest
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = input.nextInt();
        System.out.print("Enter the value of b ");
        int b = input.nextInt();
        System.out.print("Enter the value of c ");
        int c = input.nextInt();
        
        if(a==b && b==c && c==a)
        {
            System.out.print("All value are same ! ");
        }
        else
        {
            if(a==b || b==c || c==a)
            {
                System.out.print("Two value are same ! ");
            }
            else
            {

                if(a>b)
                {
                    if(a>c)
                    {
                        System.out.print("A is largest number !");
                    }
                    else
                    {
                        System.out.print("C is largest number !");
        
                    }
        
                }
                else
                {
                    if(b>c)
                    {
                        System.out.print("B is largest number !");
                    }
                    else
                    {
                        System.out.print("C is largest number !");
                    }
        
                }
            }
        }
    }
}
