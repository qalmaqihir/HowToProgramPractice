import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b=input.nextInt();

        if (a==b){
            System.out.printf("%d == %d\n",a,b);
        }
        if (a!=b){
            System.out.printf("%d != %d\n",a,b);
        }
        if(a>b){
            System.out.printf("%d > %d\n",a,b);
        }
        if (a<b){
            System.out.printf("%d < %d\n",a,b);
        }
        if(a>=b){
            System.out.printf("%d >= %d\n",a,b);
        }
        if (a<=b){
            System.out.printf("%d <= %d\n",a,b);
        }


    }
}
