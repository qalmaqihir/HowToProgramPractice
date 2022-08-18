package AutoPolicy;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1= new AutoPolicy(111111,"Toyot Cmary","NJ");
        AutoPolicy policy2=new AutoPolicy(222222, "Ford Fusion","ME");

        policyNoFaultState(policy1);
        policyNoFaultState(policy1);
    }

    private static void policyNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy: ");
        System.out.printf("Account #: %d; Car: %s; %nState %s %s a no-fault state%n%n",policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),(policy.isNotFaultState()? "is": "is not"));


    }
}
