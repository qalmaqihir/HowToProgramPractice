import java.util.Scanner;

public class ExerciseAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("How many students: ");

        int students = input.nextInt();
        double[] listGrades= new double[students];
        int getCounter=1;
        while(getCounter<=students){
            System.out.print("Enter Grade: ");
            double addList=input.nextDouble();
            listGrades[getCounter-1]=addList;
            getCounter++;
        }
//        System.out.println(listGrades.toString());
        System.out.println(calculateAverage(listGrades));
        System.out.println(listGrades);
    }
    public static double calculateAverage(double[] listGrades){
        double summ=0.0;
        for (double i:listGrades ) {
            summ+=i;
        }
        return summ/listGrades.length;
    }
}
