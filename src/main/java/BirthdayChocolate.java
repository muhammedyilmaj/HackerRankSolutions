import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int value = 0;
        if(m==1){
            if(s.get(0)==d) {
                result = 1;
            }
        }
        else{
            for(int i=0;i<s.size()-m+1;i++){
                int control = i;
                for(int j=0; j<m; j++){
                    value += s.get(i);
                    i++;
                }
                if(value==d) {
                    result++;
                    i = control;
                    value = 0;
                }
                else {
                    i=control;
                    value = 0;
                }
            }
        }
        return result;
    }
        public static void main (String[]args){
            List<Integer> list = Arrays.asList(2,5,1,3,4,4,3,4,1,1,2,1,4,1,3,3,4,2,1);
            System.out.println(birthday(list, 18, 7));
        }
    }

