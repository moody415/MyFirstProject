package Assignments;

import java.util.Scanner;

public class AssignmentFive {

    public static void main(String[] args) {

        int balance = 2000;


        System.out.println("Welcome to Capital One, your balance is"+ " " +balance);
        Scanner input = new Scanner(System.in);

        System.out.println("How much would you like to withdraw?");
        int withdrawAmount = input.nextInt();

        System.out.println("You have chosen to withdraw" + " " + withdrawAmount);
        if(withdrawAmount>balance){
            System.out.println("Error: Withdraw amount cannot be greater than balance");
        }else{
            int currentBalance = balance-withdrawAmount;
            System.out.println("Your withdraw has been successful and your current balance is"+ " " + currentBalance);
        }







    }
}



















