public class initArrays {
    public static void main(String[] args) {
//        int[] array=new int[10];
        int[] array={32,27,23,56,74,20};
        System.out.printf("%s%8s%n","Index","Value");
        for (int i=0;i<array.length;i++){
//            array[i]=i;
            System.out.printf("%5d%8d%n", i,array[i]);
        }

    }
}
