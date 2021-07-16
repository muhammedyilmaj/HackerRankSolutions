import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        set.add(ar[0]);
        for(int i=1; i<ar.length;i++) {
            if(set.contains(ar[i])) {
                result++;
                set.remove(ar[i]);
            }
            else {
                set.add(ar[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] numbers= {10, 20, 20, 10, 10, 30, 50, 10 ,20};
        System.out.println(sockMerchant(numbers.length+1,numbers));


    }
}
