public class PassArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.printf("Effects of passing references to entire array: %n" +
                "The values of the original array are: %n");
        for (int value:array ) {
            System.out.printf("     %d",value);
        }

        modifyArray(array);
        System.out.printf("%n%nThe values of modified array are: %n");
        for (int value:array ) {
            System.out.printf("     %d",value);
        }
        System.out.printf("%n%nEffects of passing array element value: %n"+
                "array[4] before modifyElement: %d%n", array[4]);
        modifyElement(array[4]);
        System.out.printf("array[4] after modifiedElement: %d%n",array[4]);
    }

    private static void modifyElement(int element) {
        element*=2;
        System.out.printf("Value of element in modifiedElement: %d%n", element);
    }

    private static void modifyArray(int[] array2) {
        for (int count=0;count<array2.length;count++){
            array2[count]*=2;
        }
    }
}
