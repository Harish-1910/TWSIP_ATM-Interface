
import java.util.*;
public class AtmInterface {
    public static void main(String[] args) {
        try {
            int pins[] = {1234, 1235, 2006, 2003, 1995, 2023, 3893};
            int balance = 100000;
            int AddAmount = 0;
            int TakeAmount = 0;

            String name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the PIN");
            int password = sc.nextInt();
            boolean pinValid = false;
            for (int pin : pins) {
                if (password == pin) {
                    pinValid = true;
                    break;
                }
            }
            if (pinValid) {
                System.out.println("Enter Your Name");
                name = sc.next();
                System.out.println("Welcome  " + name);
                while (true) {

                    System.out.println("press 1 to check your balance  ");
                    System.out.println("press 2 to Deposit ");
                    System.out.println("press 3 to Withdraw");
                    System.out.println("press 4 to take receipt");
                    System.out.println("press 5 to exit");
                    int opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("your current balance is " + balance);
                            break;
                        case 2:
                            System.out.println("Enter Amount Want To Deposit ");
                            AddAmount = sc.nextInt();
                            System.out.println("Sucessfully deposited");
                            balance = AddAmount + balance;
                            break;
                        case 3:
                            System.out.println("Enter  Amount Want To Withdraw");
                            TakeAmount = sc.nextInt();
                            if (TakeAmount > balance) {
                                System.out.println("your balance is insufficient");
                            } else {
                                System.out.println("Sucessfully taken");
                                balance = balance - TakeAmount;
                            }
                            break;
                        case 4:
                            System.out.println("  Welcome To  Java ATM  ");
                            System.out.println("Available balance In Your Bank Account " + balance);
                            System.out.println("Amount Deposited  In Your Account " + AddAmount);
                            System.out.println("Amount Withdrawn In Your Account " + TakeAmount);
                            System.out.println(" Thank You For Visting Java ATM ");
                            break;

                    }
                    if (opt == 5) {
                        System.out.println("Thank you");
                        System.out.println("HAVE A NICE DAY!!!");
                        break;
                    }


                }
            } else {

                System.out.println("Invalid Pin Number");


            }
        }
        catch (Exception e){
            System.out.println("Enter the correct input");
        }
        }
    }


