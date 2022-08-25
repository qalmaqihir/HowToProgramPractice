public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", sqaure(7));
        System.out.printf("Square of double 7.5 is %f%n", sqaure(7.5));

    }

    public static int sqaure(int i) {
        System.out.printf("%nCalling Square with int argument: %d%n",i);
        return i*i;
    }
    public static double sqaure(double i){
        System.out.printf("%nCalling Square with double argument: %f%n",i);
        return i*i;
    }

}

