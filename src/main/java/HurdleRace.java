import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HurdleRace {


    public static int hurdleRace(int k, List<Integer> hurdle) {
        Collections.sort(hurdle);
        int count = 0;
        int length = hurdle.size() -1;
        if( hurdle.get(length) > k) {
            count = hurdle.get(length) - k;
        }
        return count;

    }

    public static void main(String[] args) {
        List<Integer> hurdle = Arrays.asList(1, 6 ,3, 5, 2);

        System.out.println(hurdleRace(4, hurdle));
    }
}
