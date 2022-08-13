public class Student {
    private String name;
    private double average;
    public Student(String name, double average){
        this.name=name;
        if (average>0.0 && average <=100){
            this.average=average;
        }

    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(double average) {
        if (average>0.0 && average <=100){
            this.average=average;
        }

    }

    public String getLetterGrade(double average){
        String letter=" ";
        if (average>=90){
            letter="A";
        } else if (average>=80) {
            letter="B";
        } else if (average>=60) {
            letter="C";
        }
        else{
            letter="Fail";

        }
        return letter;

    }
}
