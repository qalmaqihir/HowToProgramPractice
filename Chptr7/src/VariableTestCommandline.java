public class VariableTestCommandline {
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.printf("Error: Please re-enter the entire command, including%nan array size, initial value and increment.%n");
        }else{
            int arrayLength=Integer.parseInt(args[0]);
            int[] array=new int[arrayLength];
            int initValue=Integer.parseInt(args[1]);
            int increment=Integer.parseInt(args[2]);
            for(int counter=0;counter<arrayLength;counter++){
                array[counter]=initValue+increment*counter;
            }

            System.out.printf("%5s%8s%n", "Index","Value");
            for(int counter=0;counter<arrayLength;counter++){
                System.out.printf("%5d%8d%n", counter,array[counter]);
            }
        }
    }
}
