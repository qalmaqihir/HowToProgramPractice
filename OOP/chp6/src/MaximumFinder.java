import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating-values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximumFinder(number1,number2,number3);
        System.out.printf("Maximum is:%.2f ", result);
    }

    private static double maximumFinder(double a, double b, double c) {
        double maximumValue=a;
        if (b>maximumValue){
            maximumValue=b;
        }
        if (c>maximumValue){
            maximumValue=c;
        }
        return maximumValue;

    }

}
