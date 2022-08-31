public class Time1Test {
    public static void main(String[] args) {
//        Time1 time=new Time1();
//        time.setTime(23,45,50);
//        System.out.printf("Standarded Time: %s\n",time);//Can be done as time.toString()
//        System.out.println("Checking the overriden method toString: ");
//        System.out.println(time.toString());
//        System.out.printf("Universal time: %s \n", time.toUniversalString());
        System.out.println("From book");
        System.out.println("----------------------------------");
        Time1 time1= new Time1();
        displayTime("After time object is created: ",time1);
        System.out.println();
        time1.setTime(13,27,6);
        displayTime("After calling the test setTime ",time1);
        System.out.println();
        try {
            time1.setTime(99,99,99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values: ",time1);


    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time %s%n", header,t.toUniversalString(),t.toString());
    }
}
