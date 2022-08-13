public class CountPrime {
    public static void main(String[] args) {
        
    }
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] is_Prime = new boolean[n];
        for (int i = 0; i < n; i++) {
            is_Prime[i] = true;
        }
        is_Prime[0] = is_Prime[1] = false;
        for (int j = 2; j <= (int) Math.ceil(Math.sqrt(n)); j++) {
            if (is_Prime[j]) {
                for (int multiples_of_j = 0; multiples_of_j < n; multiples_of_j++) {
                    int multiple = multiples_of_j * j;
                    is_Prime[multiple] = false;
                }
            }
        }
        int total=0;
        for(boolean b:is_Prime){
            total+=b?1:0;
    }
        return total;

}


//         if n <2:
//             return 0
//         is_prime=[True for i in range(n)]
//         is_prime[0]=is_prime[1]=False
//         for i in range(2,math.ceil(math.sqrt(n))):
//             if is_prime[i]:
//                 for multiples_of_i in range(i*i,n,i):
}
