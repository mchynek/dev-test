package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Operations2 {

    public static List<List<Integer>> pairs(List<Integer> integerList) {
        Collections.sort(integerList);
        List<List<Integer>> pair = new ArrayList<>();
        for (int i = integerList.size()-1; i >= 0; i--) {
            for (Integer j : integerList) {
                List<Integer> tab = new ArrayList<>();
                if ((integerList.get(i) + j) == 13 && integerList.get(i) > j) {
                    tab.add(j);
                    tab.add(integerList.get(i));
                    pair.add(tab);
                }
            }
        }
        return pair;
    }
}
