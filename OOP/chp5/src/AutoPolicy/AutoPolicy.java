package AutoPolicy;

public class AutoPolicy {
    int accountNumber;
    String makeAndModel;
    String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber=accountNumber;
        this.makeAndModel=makeAndModel;
        this.state=state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isNotFaultState(){
        boolean noFaultState;
        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState=true;
            default:
                noFaultState=false;
                break;
        }
        return noFaultState;
    }
}
