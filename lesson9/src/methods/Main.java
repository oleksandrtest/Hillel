package methods;

import java.util.*;

public class Main {
    public int countOccurance(List <String> strings, Object word) {
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

    public ArrayList<String> findUnique(List<String> nums){

        var list = new ArrayList<>();
        for (Object num: nums ) {
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        return list;
    };

    public ArrayList<String> calcOccurance(List<String> strings) {
        var list = new ArrayList<String>();
        for (Object word: findUnique(strings)) {
            if(!list.contains(word)){
                list.add(word+ ": " + countOccurance(strings, word));
            }
        }
        return list;
    }

    public ArrayList<String> findOccurance(List<String> strings) {
        var list = new ArrayList<>();
        for (Object word: findUnique(strings)) {
            if(!list.contains(word)){
                list.add(("{" + "name: " + "\"" + word + "\"," + " occurrence: " + countOccurance(strings, word) + "}"));
            }
        }
        return list;
    };

}