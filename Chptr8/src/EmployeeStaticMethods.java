public class EmployeeStaticMethods {
    private static int count=0;
    private String firstName;
    private String lasttName;

    public EmployeeStaticMethods(String firstName,String lasttName){
        this.firstName=firstName;
        this.lasttName=lasttName;
        ++count;
        System.out.printf("Empolyee Constructor: %s %s; count = %d%n",firstName,lasttName,count);
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public String toString(){
        return String.format("%nEmployee details:%nFirst Name: %s, Second Name: %s%n ", firstName,lasttName);
    }

}
