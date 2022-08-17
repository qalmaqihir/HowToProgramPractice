import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Account myAccount = new Account("name of account",5);
//        System.out.printf("Initial name is: %s%n%n ",myAccount.getName());
//        //getting the name fromm the user
//        System.out.print("Please enter an account name: ");
//        //read a line of text
//        String name = input.nextLine();
//        //put the name to instance variable name of the class Account
//        myAccount.setName(name);
//
//        //Printing the name stored in the object myAccount
//        System.out.printf("Name in Object myAccount is: %n%s%n",myAccount.getName());
//        System.out.println("\n\n-------------------------------------------------------\n\n");
//        // Testing the constructor
//        Account account1=new Account("Account 1",1);
//        Account account2=new Account("Account 2",50);
//        System.out.printf("Account 1 name is %s with a balance of %f%n", account1.getName(),account1.getBalance());
//        System.out.printf("Account 2 name is %s and balance is %f%n", account2.getName(),account2.getBalance());
        Account account1= new Account("Jawad",10.3);
        Account account2= new Account("Khan",120.34);

        //display initial balance of each acount object
        System.out.printf("%s balance: %f$%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: %f$%n",account2.getName(),account2.getBalance());

        // create a scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount= input.nextDouble(); //get the user input
        System.out.printf("%nAdding %.2f to account 1 balance %n", depositAmount);
        account1.deposit(depositAmount);
        // displaying the balances
        System.out.printf("%s balance %.2f$%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance %.2f$%n",account2.getName(),account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount=input.nextDouble();
        System.out.printf("%nAdding %.2f to account 1 balance %n", depositAmount);
        account2.deposit(depositAmount);

        // displaying the balances
        System.out.printf("%s balance %.2f$%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance %.2f$%n",account1.getName(),account2.getBalance());



    }
}
