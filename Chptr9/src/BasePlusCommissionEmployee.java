public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary=baseSalary;
    }

    public double getBaseSlary() {
        return baseSalary;
    }

    public void setBaseSlary(double baseSalary) {
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings(){
        return baseSalary+ (getCommissionRate()+getBaseSlary());
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", getFirstName(),getLastName(),
                "Social Security NO. ", getSocialSecurityNumber(), "Gross salas", getGrossSales(),
                "Commission rate",getCommissionRate(),"Base salary",getBaseSlary());
    }
}
