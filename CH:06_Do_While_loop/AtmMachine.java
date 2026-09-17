// WAP to develop ATM Machine Algorithm using do while loop

import java.util.Scanner;

public class AtmMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Current Balance ");

        int balance = input.nextInt();
        int choice;
        int num;

        do {
            System.out.println("Press --> 1 to Check Balance");
            System.out.println("Press --> 2 to Deposit Amount");
            System.out.println("Press --> 3 to Withdraw Amount");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your current balance is " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to Deposit: ");
                    int deposit = input.nextInt();

                    balance = balance + deposit;

                    System.out.println("Current balance is " + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to Withdraw: ");
                    int withdraw = input.nextInt();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Updated balance is " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }

                    break;

                default:
                    System.out.println("Invalid Operation Specified");
            }

            System.out.println("Do you want to perform more Operations?");
            System.out.println("Press 1 for Yes");
            System.out.println("Press 2 for No");

            num = input.nextInt();

        } while (num == 1);

        System.out.println("Thank you for using ATM!");

        input.close();
    }
}
