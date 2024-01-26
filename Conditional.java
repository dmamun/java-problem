import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();

        System.out.println("Enter the second number:");
        int num2 = in.nextInt();

        System.out.println("Enter the third number:");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is " + num2);
        } else {
            System.out.println("The greatest number is " + num3);
        }
    }
}
