public class StudentPoll {
    public static void main(String[] args) {
        int[] response={1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency=new int[6];
        for(int answer=0; answer<response.length;answer++){
            try{
                ++frequency[response[answer]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("     responses[%d] = %d%n%n", answer,response[answer]);
            }

        }
        System.out.printf("%s%15s%n","Rating","Frequecncy");
        for (int rating=1; rating<frequency.length;rating++){
            System.out.printf("%6d%10d%n", rating,frequency[rating]);
        }
    }
}
