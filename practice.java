import java.util.Scanner;
public class gayass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String Prologue = "You finally gather the seven dragon balls, hoping that shenron will solve your problem";

        String Bruh = "\n press A to continue: ";

        System.out.println(Prologue + Bruh);

        String progress = sc.nextLine();

        if (progress == "A") ;

        {
            System.out.println("*yawn* you dare wake me up? I'll let you off the hook only this once, mortal, State your wish");
        }

        System.out.println("what would you like to wish for? \n press 1 for mathematical calculations " +
                "\n 2 for tasty food \n 3 for lots of money \n 4 for nothing");

        int W = sc.nextInt();
        sc.nextLine();
        switch (W) {
            case 1: {
                System.out.println("Alright, what would you like to do? \n press 1 for addition \n 2 for subtraction \n 3 for multiplication" +
                        " \n 4 for division \n oh and do it a little quick please, even eternal dragons need rest *yawn*");

                int P = sc.nextInt();

                switch (P) {

                    case 1: {
                        System.out.println("So addition it is. State your first number");
                        String WOW = "state your first number: ";
                        String DAMN = "state your second number";
                        System.out.println(WOW);
                        int fn = sc.nextInt();
                        System.out.println(DAMN);
                        int sn = sc.nextInt();

                        int ba = fn + sn;

                        System.out.println("the result is \n" + ba + "\n farewell mortal, hope to never see you again");
                        break;
                    }

                    case 2: {
                        System.out.println("So subtraction it is. State your first number");
                        String ISEE = "state your first number: ";
                        String IMSPED = "state your second number";
                        System.out.println(ISEE);
                        int fn = sc.nextInt();
                        System.out.println(IMSPED);
                        int sn = sc.nextInt();

                        int SPEDASSMF = fn - sn;

                        System.out.println("the result is \n" + SPEDASSMF + "\n farewell mortal, hope to never see you again");
                        break;
                    }

                    case 3: {
                        System.out.println("So multiplication it is. State your first number");
                        String WOO = "state your first number: ";
                        String ZAMN = "state your second number";
                        System.out.println(WOO);
                        int fn = sc.nextInt();
                        System.out.println(ZAMN);
                        int sn = sc.nextInt();

                        int WBW = fn * sn;

                        System.out.println("the result is \n" + WBW + "\n farewell mortal, hope to never see you again");
                        break;

                    }

                    case 4:
                        System.out.println("So division it is. State your first number");
                        String HUH = "state your first number: ";
                        String OKOK = "state your second number";
                        System.out.println(HUH);
                        int fn = sc.nextInt();
                        System.out.println(OKOK);
                        int sn = sc.nextInt();

                        int KYS = fn / sn;

                        System.out.println("the result is \n" + KYS + "\n farewell mortal, hope to never see you again");
                        break;


                }

                break;
            }

                case 2: {

                    System.out.println("So you want hella delicious food? here you go \n shenron materializes a huge table full of good food in front of you");
                    String balls = "press D to continue: ";
                    System.out.println(balls);
                    String ee = sc.nextLine();
                    if (ee == "D"); {
                        System.out.println("\n farewell mortal, hope to never see you again");
                    }

                    break;

                       }


            case 3: {
                System.out.println("Heres 10 million, now let me get some rest *yawn*");
                System.out.println("\n press C to Continue: ");

                String option = sc.nextLine();


                if (option == "C");

                {
                    System.out.println("\n You look at Shenron in amazement as he materializes sacks of currency from nothing and gives it to you \n he bids you goodbye and the dragonballs split and teleport");

                }

                break;


            }


            case 4:
            {
                System.out.println("aight bye then, i hope i dont see you again");
                break;
            }
          }

      }

    }