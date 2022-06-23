package Practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");

        String name = input.nextLine();
        System.out.println("Welcome" + " " + name);

        System.out.println("What is your age?");

        int age = input.nextInt();
        System.out.println("Your age is" + " " + age);

        if (age <= 18) {
            System.out.println("You have to be 19 and older to create a account ");
        } else {
            System.out.println("You have successfully created a account");
        }
        input.close();
    }

}
