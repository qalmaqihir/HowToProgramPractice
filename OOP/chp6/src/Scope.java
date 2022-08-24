public class Scope {
    private static int x=1;

    public static void main(String[] args) {
        int x=5;
        System.out.printf("Local x in main %d: %n",x);
        useLocalVariable();
        useField();
        System.out.println("Let's try again");
        useLocalVariable();
        useField();
        System.out.printf("%nLocal x in main is %d%n",x);
    }

    private static void useField() {
        System.out.printf("%nField x on entering method useField() is %d%n",x);
        x*=10;
        System.out.printf("%nField x before exiting method useField() is %d%n",x);
    }

    private static void useLocalVariable() {
        int x=25;
        System.out.printf("%nLocal x on entering method useLocal() %d%n",x);
        ++x;
        System.out.printf("%nLocal x on before exiting method useLocal() %d%n",x);
    }
}
