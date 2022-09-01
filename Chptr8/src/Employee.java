public class Employee {
    private String firstName;
    private String lasttName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstName,String lasttName, Date birthDate,Date hireDate){
        this.firstName=firstName;
        this.lasttName=lasttName;
        this.birthDate=birthDate;
        this.hireDate=hireDate;
    }
    public String toString(){
        return String.format("%nEmployee details:%nFirst Name: %s, Second Name: %s%nBirthdate: %s, Hired on: %s ", firstName,lasttName,birthDate,hireDate);
    }
}
