public class EnhancedFor {
    public static void main(String[] args) {
        int total=0;
        int[] array={3,-1,4,5,65,7,0,-5,-8,3,2,1};
        for (int item:array) {
            total+=item;
        }
        System.out.printf("Total of the array: %d%n", total);
    }
}
