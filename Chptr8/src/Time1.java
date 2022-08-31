public class Time1 {
    private int hour, minute, second;

    public void setTime(int hour, int minute, int second){
        if(hour>0 && hour<=24 && minute>0 && minute<=60 && second>0 && second<=60){
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }else{
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
    public String toString(){
        return String.format("%02d:%02d:%02d %s%n", ((hour==0 || hour ==12)? hour:hour%12),minute,second,(hour<1? "AM":"PM"));
    }

}
