
public class Palindrome {

    private static boolean isPalindrone(int value) {

        boolean result = true;
        if(value < 0) {
            result = false;
        }
        String stringValue = String.valueOf(value);
        int length = stringValue.length() %2  == 0 ? stringValue.length()/2: stringValue.length()/2;
        for (int i = 0; i < length; i++) {
            if(stringValue.charAt(i) != stringValue.charAt(stringValue.length()-1-i)) {
                result = false;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(isPalindrone(-110));
    }
}
