import java.util.Arrays;

/**
 * This question can be asked by interviewers
 * There could be some other solutions
 */
public class CountOfStringValues {
    private static String getCountAndCharString (String value) {
        String sortedString = sortString(value);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < sortedString.length() - 1; i++) {
            if(sortedString.charAt(i) == sortedString.charAt(i+1) ) {
                count++;
                if (i == sortedString.length()-2) {
                    result.append(sortedString.charAt(i));
                    result.append(count);
                }
            } else if (sortedString.charAt(i) != sortedString.charAt(i+1)){
                result.append(sortedString.charAt(i));
                result.append(count);
                count = 1;
            }

        }
        return result.toString();

    }
    public static String sortString(String inputString) {
        Character[] tempArray = new Character[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }


        Arrays.sort(tempArray);
        StringBuilder sb = new StringBuilder(tempArray.length);
        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }
    public static void main(String[] args) {
        String value = "aaaaaaabbbccccc";
        System.out.println(getCountAndCharString(value));
    }
}
