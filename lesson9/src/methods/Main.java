package methods;

import java.util.*;

public class Main {
    public int countOccurance(List <?> strings, Object word) {
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

    public ArrayList<?> findUnique(List<?> nums){

        var out = new ArrayList<>();
        for (Object num: nums ) {
            if(!out.contains(num)) {
                out.add(num);
            }
        }
        return out;
    };

    public ArrayList<String> calcOccurance(List<?> strings) {
        var out = new ArrayList<String>();
        for (Object word: findUnique(strings)) {
            if(!out.contains(word)){
                out.add(word+ ": " + countOccurance(strings, word));
            }
        }
        return out;
    }

    public ArrayList<?> findOccurance(List<?> strings) {
        var list = new ArrayList<>();
        for (Object word: findUnique(strings)) {
            if(!list.contains(word)){
                list.add(("{" + "name: " + "\"" + word + "\"," + " occurrence: " + countOccurance(strings, word) + "}"));
            }
        }
        return list;
    };

}