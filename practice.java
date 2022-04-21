import java.util.Scanner;
public class practice 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("> You finally gather the seven dragon balls, hoping that shenron will solve your problem \n> press 1 to continue");
        int progress = sc.nextInt();
        if(progress == 1)
        {
            System.out.println("*yawn* you dare wake me up? I'll let you off the hook only this once, mortal, State your wish");
            System.out.println("what would you like to wish for? \n- press 1 for mathematical calculations " +
            "\n- 2 for tasty food \n- 3 for lots of money \n- 4 for nothing");
            int W = sc.nextInt();
            sc.nextLine();
            if(W == 1)
            {
                System.out.println(" What do you want to calculate ? , Press 1 to add , 2 to subtract , 3 to multiply , 4 to divide ");
                int Y = sc.nextInt();
                switch(Y)
                {
                case 1: System.out.println("So addition it is. State your first number");
                        double fn  = sc.nextDouble();
                        System.out.println("State your second number ");
                        double sn = sc.nextDouble();
                        double ans = fn + sn;
                        System.out.println("the result is --> " + ans + "\n farewell mortal, hope to never see you again");
                break;
                case 2: System.out.println("So subtraction it is. State your first number");
                        fn = sc.nextDouble();
                        System.out.println(" State your second number ");
                        sn = sc.nextDouble();
                        ans = fn - sn;
                        System.out.println("the result is --> " + ans + "\n farewell mortal, hope to never see you again");
                break;
                case 3: System.out.println("So multiplication it is. State your first number");
                        fn = sc.nextDouble();
                        System.out.println( "State your second number " );
                        sn = sc.nextDouble();
                        ans = fn * sn;
                        System.out.println("the result is --> " + ans + "\n farewell mortal, hope to never see you again");
                break;
                case 4: System.out.println("So division it is. State your first number");
                        fn = sc.nextDouble();
                        System.out.println( "State your second number " );
                        sn = sc.nextDouble();
                        ans = fn / sn;
                        System.out.println("the result is --> " + ans + "\n farewell mortal, hope to never see you again");
                break;
                }
            }
            if(W == 2)
            {
                System.out.println("So you want hella delicious food? ");
                System.out.println("press 1 to continue ");
                int ee = sc.nextInt();
                if(ee == 1)
                {
                    System.out.println(" Here have some khakra ");
                    System.out.println(" farewell mortal, hope to never see you again");
                }
                else if(ee != 1)
                {
                    System.out.println(" You failed to press 1 no khakra for you ");
                }
            }
            if(W == 3)
            {
                System.out.println("Heres 10 million, now let me get some rest *yawn*");
                System.out.println("\n press 1 to Continue: ");
                int option = sc.nextInt();
                if(option == 1)
                {
                    System.out.println(" You look at Shenron in amazement \n as he materializes sacks of currency from nothing \n and gives it to you \n he bids you goodbye and the dragonballs split and teleport");
                }
                else if(option != 1)
                {
                    System.out.println(" You failed to press 1 , guess you hate free money ");
                }
            }
            if(W == 4)
            {
                System.out.println("aight bye then, i hope i dont see you again");
            }
        }
        else if(progress != 1)
        {
            System.out.println(" You failed to press 1 Bruh ");
        }
    }
}