public class init2dArrays {
    public static void main(String[] args) {
        // aarray with 3 rows 4 cols
        int[][] array4=new int[3][4];

        // a multi-di array each row having differen lenght of cols
        int[][] b=new int[2][];
        b[0]=new int[5]; // create 5 columns for row 1
        b[1]=new int[3];

        int[][] array1={{1,2,3},{4,5,6}};
        int [][] array2={{1,2},{3},{4,5,6}};
        System.out.println("Values in array1 by row are");
        outputArray(array1);
        System.out.printf("%nValues in array2 by row are %n");
        outputArray(array2);
        System.out.printf("Array without elements: %n");
        outputArray(array4);
        System.out.println("Array with different columns lenght: ");
        outputArray(b);
    }

    private static void outputArray(int[][] array) {
        for(int row =0; row<array.length;row++){
            for(int col =0; col<array[row].length;col++){
                System.out.printf("%d       ",array[row][col]);
            }
            System.out.println();
        }
    }
}
