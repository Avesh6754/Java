import java.util.Scanner;
class Switchcase
{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = input.nextInt();
        System.out.print("Enter the value of b ");
        int b = input.nextInt();
        int c;
        do
        {

            System.out.println("Enter 1 for + ");
            System.out.println("Enter 2 for - ");
            System.out.println("Enter 3 for * ");
            System.out.println("Enter 4 for / ");
            System.out.println("Enter 5 for % ");
            System.out.println("Enter 0 for exit ");
             c = input.nextInt();
           
    
                switch(c)
                {
                    case 1:System.out.print(a+b);
                    break;
                    case 2:System.out.print(a-b);
                    break;
                    case 3:System.out.print(a*b);
                    break;
                    case 4:System.out.print(a/b);
                    break;
                    case 5:System.out.print(a%b);
                    break;
                    default : System.out.print("Enter the right input ");
                }
        }while(c!=0);
       
        

    }
}
