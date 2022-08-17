import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total=0, gradeCounter=0;
        System.out.println("Enter the grade or -1 to quit: ");
        int grade= input.nextInt();
        while(grade!=-1){
            total= total+grade;
            gradeCounter++;
            System.out.println("Enter the grade or -1 to quit: ");
            grade=input.nextInt();
        }
        if(gradeCounter!=0){
            double average=(double) total/gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n",gradeCounter,total);
            System.out.printf("Class Average is %f%n", average);
        }else{
            System.out.println("No grades Entered...");
        }

    }
}
