class Calculate 
{
    public static void main(String []args)
    {
        double balance;
        double rate;
        double duration;
        double cost;

        balance =170;
        rate=1.2;
        duration =37;
        cost=duration*rate;
        balance=balance-cost;

        System.out.print("Call Duration ");
        System.out.println(duration);
        System.out.println("Second ");
        System.out.print("Balabnce "+balance+"Rupees ");


    }
}