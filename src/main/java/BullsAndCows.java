import java.util.ArrayList;
import java.util.List;

public class BullsAndCows {

    public String getHint(String secret, String guess) {
        List<Character> secretLetter = new ArrayList<>();
        List<Character> guessLetter = new ArrayList<>();
        int size = secret.length();
        int bulls = 0;
        int cows = 0;
        for(int i = 0 ; i < size; i ++) {
            secretLetter.add(secret.charAt(i));
            guessLetter.add(guess.charAt(i));
            if(secretLetter.get(i) == guessLetter.get(i)){
                bulls ++;
                secretLetter.remove(secretLetter.get(i));
            }
            else if(secretLetter.contains(guessLetter.get(i))){
                cows++;
                secretLetter.remove(guessLetter.get(i));
            }
        }

        return bulls + "a" + cows + "b";

    }
}
