public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("jawad","haider","192-0903-88931-1",10000,0.06);
        System.out.printf("%n%s %s%n","First name is ", employee.getFirstName());
        System.out.printf("%s %s%n","Last name is ", employee.getLastName());
        System.out.printf("%s %s%n","Social Security No.  is ", employee.getSocialSecurityNumber());
        System.out.printf("%s %s%n","Commission rate is ",employee.getCommissionRate());
        System.out.printf("%s %s%n","Gross sales is ", employee.getGrossSales());
        employee.setGrossSales(5000);
        employee.setCommissionRate(0.9);
        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString():",employee);

    }
}
