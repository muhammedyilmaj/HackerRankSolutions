import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm= new HashMap<>();

        for(int i= 0; i<strs.length; i++) {
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!hm.containsKey(key)) {
                List<String> firstValue =  new ArrayList<>();
                firstValue.add(strs[i]);
                hm.put(key, firstValue);
            } else {
                hm.get(key).add(strs[i]);
            }
        }
        List<List<String>> result = new ArrayList<>();

        for(Map.Entry<String,List<String>> ent : hm.entrySet()) {
            result.add(ent.getValue());
        }

        return result;


    }
}
