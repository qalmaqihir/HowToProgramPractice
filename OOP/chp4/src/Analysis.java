import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes=0,failure=0,studentCounter=0;
        while (studentCounter<=10){
            System.out.println("Enter result (1=pass, 1=fail): ");
            int result=input.nextInt();
            if(result==1){
                passes++;
            }else {
                failure++;
            }
            studentCounter++;
        }
        System.out.printf("Passed: %d %nFailed: %d",passes,failure);
        if(passes>8){
            System.out.printf("%nBonus to instructor..!!!");
        }
    }
}
