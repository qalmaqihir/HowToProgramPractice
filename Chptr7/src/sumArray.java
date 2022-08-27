public class sumArray {
    public static void main(String[] args) {
        int[] array={10,-12,2,254,67,89,86,56,34,32,43,78,-192,-2,123,220};
        int total=0;
        for(int i=0;i<array.length;i++){
            total+=array[i];
        }
        System.out.printf("Total: %d%n", total);

    }
}
