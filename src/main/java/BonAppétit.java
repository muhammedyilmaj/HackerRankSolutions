import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppétit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalAmount = 0;
        int totalAmountWithoutAnna = 0;
        for(int i = 0; i<bill.size(); i++) {
            totalAmount+=bill.get(i);
            if(i!=k){
                totalAmountWithoutAnna += bill.get(i);
            }
        }
        if(totalAmountWithoutAnna/2 == b){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(totalAmount/2-totalAmountWithoutAnna/2);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,10,2,9);
        bonAppetit(list,1,7);

    }
}
