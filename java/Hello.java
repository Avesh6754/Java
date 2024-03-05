import java.util.Scanner;
class Hello
{

    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the value of a ");
        int a = input.nextInt();
        
        if(a>=18)
        {
            System.out.print("You are eligible for vote ");
            
        }
        else if(a<=0)
        {
            System.out.print("You enter negative and Zero age : ");
            
        }
        else
        {
            System.out.print("You are not eligible for vote  ");
     
        }
   

    }
}