import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        double[] doubleArray={5.4,3.5,7.5,3.0,2.9,.05,1.5,6.8,1.681};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");
        for (double value: doubleArray){
            System.out.printf("%.2f",value);
        }
        int[] filledIntArray=new int[10];
        displayArray(filledIntArray,"filledIntArray");

        int[] intArray={1,2,3,4,5,56,7,0};
        int[] intArrayCopy=new int[intArray.length];
        System.arraycopy(intArray, 0,intArrayCopy,0,intArrayCopy.length);
        displayArray(intArray,"intArray");
        displayArray(intArray,"intArrayCopy");
        boolean b= Arrays.equals(intArray,intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n",b?"==":"!=");

        int location =Arrays.binarySearch(intArray,5);
        if (location>=0){
            System.out.printf("Found 5 at element %d in intArray%n",location);
        }
        else {
            System.out.println("5 not Found in intArray");
        }
        location=Arrays.binarySearch(intArray,8763);
        if (location >= 0) {

            System.out.printf("Found 8763 at element %d in intArray");
        }
        else {
            System.out.println("8763 not found in intArray");
        }

    }
    public static void displayArray(int[] array, String description){
        System.out.printf("%n%s",description);
        for(int value:array){
            System.out.printf("%d ",value);
        }
    }
}
