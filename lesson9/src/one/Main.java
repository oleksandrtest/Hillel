package one;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public int countOccurance(List <String> strings, String word) {
        var count = 0;
        for (var wd: strings) {
            if (wd.equals(word)) {
                count++;
            }
        }
        return count;
    }


    public List<Integer> toList(int[] arr){
        var list = new ArrayList<Integer>();
        for (var num: arr) {
            list.add(num);
        }
        return list;
    }


    public List<Integer> findUnique(List<Integer> nums){

        List<Integer> sorted = nums.stream().sorted().collect(Collectors.toList());
        List<Integer> out = new ArrayList<>();
        int prev = 0;
        for (int num: sorted) {
            if(prev != num) {
                prev = num;
                out.add(num);
            }
        }
        return out;
    };


    public Map<String, Integer> calcOccurance(List<String> strings) {
        Map<String, Integer> words = new HashMap<String, Integer>();
        for (String wd: strings) {
            if (!words.containsKey(wd)) {
                words.put(wd, 1);
            } else {
                words.put(wd, words.get(wd) + 1);
            }
        }
        return words;
    };

    public ArrayList<String> findOccurance(List<String> strings) {

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : (calcOccurance(strings)).entrySet()) {

            list.add("{" + "name: " + "\"" + entry.getKey() + "\"," + " occurrence: " + entry.getValue() + "}");
        }
             return list;
    };

}