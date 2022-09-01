public class PackageAccess {
    public static void main(String[] args) {
        PackageData packageAccess=new PackageData();
        System.out.printf("After instatiation: %n%s%n", packageAccess);
        packageAccess.number = 77;
        packageAccess.str="GoodBye";
        System.out.printf("%nAfter changing the values: %n%s%n",packageAccess);
    }

}
class PackageData{
    int number =0;
    String str="Hello man,";
    public String toString(){
        return String.format("Number: %d; String: %s",number,str);
    }
}
