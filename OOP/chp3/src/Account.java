public class Account {
    private String name; //instance variable
    private double balance; //another instance variable

    //Constructor initializes name with parameter name
    //recieves two parameters
    public Account(String name, double balance){
        this.name=name;

        //Validate that the balance is greater than 0.0, if it is no;
        // then instance variable balance keeps its defualt value of 0.0
        if(balance>0.00){
            //if the balance is valid, then assign it to the instance variable
            this.balance=balance;
        }
    }

    //method to set the name in the object
    public void setName(String name){
        this.name=name; //store the name
    }
    //method to retrieve the name from the obect
    public String getName(){
        return name;//return the value of name to caller

    }

    // method that deposits (adds) only a valid amount to the balace
    public void deposit(double depositAmount){
        if (depositAmount>0.0){
            balance+=depositAmount;
        }
    }

    // Method that returns the account balance
    public double getBalance(){
        return balance;
    }
}
