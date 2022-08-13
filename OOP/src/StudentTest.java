public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Jawad",30.0);
        Student student1 = new Student("Haider",95.9);
        System.out.println(student1);
        System.out.println(student);
        System.out.printf("Name: %s \tAverage: %.2f%n",student.getName(),student.getAverage());
        System.out.printf("Name: %s \tAverage: %.2f%n",student1.getName(),student1.getAverage());
        System.out.printf("%s's Letter grade is %s%n",student.getName(),student.getLetterGrade(student.getAverage()));
        System.out.printf("%s's Letter grade is %s%n",student1.getName(),student1.getLetterGrade(student1.getAverage()));
    }
}
