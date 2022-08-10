// A program that inputs two numbers and output their sum
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a scanner to obtain the input from the command line
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: "); //prompt
        int number1=input.nextInt();
        System.out.println("Enter next number: ");
        int number2=input.nextInt();

        System.out.printf("Sum of %d and %d is %d\n",number1,number2,number1+number2);

    }

}
