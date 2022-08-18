import java.util.Scanner;

public class LetterGrdes {
    public static void main(String[] args) {
        int total=0, gradeCounter=0, aCount=0, bCount=0, cCount=0, dCount=0, fCount=0;
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n  %s%n  %s%n",
                "Enter the integer grades in the range 0-100. ",
                "Type the end of file indictor to terminate input: ",
                "On UNIX/Linux/MacOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter: ");

        while(input.hasNext()){
            int grade=input.nextInt();
            total+=grade;
            ++gradeCounter;
            switch (grade/10){
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }
        System.out.printf("%nGrade Report: %n");
        if(gradeCounter!=0){
            double average=(double) total/gradeCounter;
            System.out.printf("Total of the %d grades enter is %d%n", gradeCounter, total);
            System.out.printf("Class Average is %.2f", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students whoe recieved each grade: ",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ",cCount,
                    "D: ",dCount,
                    "F: ",fCount);
        }else{
            System.out.println("No grades entered");
        }
    }
}
