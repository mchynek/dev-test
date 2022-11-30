package task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class EnterData {

    public static int[][] createEnterData(List<Integer> myList) {
        int size = myList.size() / 2;
        myList.remove(0);
        int[][] tab = new int[size][2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                tab[i][j] = myList.get(i);
                i++;
            }
        }
        return  tab;
    }
}

