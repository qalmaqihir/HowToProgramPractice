public class Interest {
    public static void main(String[] args) {
       // calculateInterest(int years, int original_amount,double rate,int amount_deposit);
        double originalAmount=1000;
        double rate=0.05;
        int years=10;
        double amount=originalAmount;
        System.out.printf("original Amount: ", originalAmount);
        System.out.println();
        System.out.printf("%s%20s%n","Year","Amount on deposit");
        for (int i =0; i<=years;i++){
            amount=originalAmount*Math.pow(1+rate,i);
//            System.out.printf("Amount after %4d Year = %20.2f%n", i,amount);
            System.out.printf("%4d %,16.2f%n", i,amount);
        }
    }

}
