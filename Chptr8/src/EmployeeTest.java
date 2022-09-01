public class EmployeeTest {
    public static void main(String[] args) {
        Date birthdate=new Date(5,11,1996);
        Date hired = new Date(3,9,2022);
        Employee a=new Employee("Yasir","Nawaz", birthdate,hired);
        a.toString();
    }
}
