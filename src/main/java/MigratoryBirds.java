import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        int value4 = 0;
        int value5 = 0;
        int result = 0;
        for (int i = 0; i<arr.size() ;i++) {
            if(arr.get(i) == 1){
                value1++;
            }
            else if(arr.get(i) == 2) {
                value2++;
            }
            else if(arr.get(i) == 3) {
                value3++;

            }
            else if(arr.get(i) == 4) {
                value4++;

            }
            else if(arr.get(i) == 5) {
                value5++;

            }
        }
        if(value1>=value2 && value1>= value3 && value1>= value4 && value1>= value5){

            result = 1;
        }
        if(value2>value1 && value2>= value3 && value2>= value4 && value2>= value5){
            result = 2;
        }
        if(value3>value1 && value3> value2 && value3>= value4 && value3>= value5){
            result = 3;
        }
        if(value4>value1 && value4> value3 && value4> value2 && value4>= value5){
            result = 4;
        }
        if(value5>value1 && value5> value3 && value5> value2 && value5> value4){
            result = 5;
        }

    return result;
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,5,5,3);
        System.out.println(migratoryBirds(list));
    }
}
