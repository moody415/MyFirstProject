package Practice;
import java.util.Scanner;

public class ScannerPracticeTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = input.nextLine();
        System.out.println("Welcome" + " " + name);

        System.out.println("What is your age");
        int age = input.nextInt();

        System.out.println("Your age is" + " " + age);
        if (age <= 21) {
            System.out.println("Your are underage and not allowed to drink");
        }else{
            System.out.println("Your are allowed to drink");
        }
        input.close();

    }
}