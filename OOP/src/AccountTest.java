import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.printf("Initial name is: %s%n%n ",myAccount.getName());
        //getting the name fromm the user
        System.out.print("Please enter an account name: ");
        //read a line of text
        String name = input.nextLine();
        //put the name to instance variable name of the class Account
        myAccount.setName(name);

        //Printing the name stored in the object myAccount
        System.out.printf("Name in Object myAccount is: %n%s%n",myAccount.getName());
    }
}
