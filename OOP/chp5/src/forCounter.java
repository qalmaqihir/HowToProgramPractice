public class forCounter {
    public static void main(String[] args) {
        for (int counter=0; counter<=10;counter++){
            System.out.printf("%d  ",counter);
        }
        System.out.println();
        for(int i=100; i>=1; i/=2){
            System.out.printf("%d ",i);
        }
        System.out.println();
        for(int i=100; i>=1; i*=2){
            System.out.printf("%d ",i); //Infinite loop till the last possible value of int
        }

    }

}
