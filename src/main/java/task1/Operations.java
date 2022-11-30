package task1;

import java.util.*;

public class Operations {

    public static Set <Integer> sorted(List<Integer> listToSort){
        Set <Integer> uniqueList = new HashSet<>();
        for(Integer x : listToSort) uniqueList.add(x);
        TreeSet sortedList = new TreeSet(uniqueList);
        return sortedList;
    }
    public static Integer numberOfElements(List<Integer> listToCount){
        return listToCount.size();
    }
    public static Integer distinct (List <Integer> listToDistinct){
        Set <Integer> uniqueList = new HashSet<>();
        for(Integer x : listToDistinct) uniqueList.add(x);
        return uniqueList.size();
    }
    public static Integer minimum (List<Integer> listToMin){
        Collections.sort(listToMin);
        return listToMin.get(0);
    }
    public static Integer maximum (List<Integer> listToMax){
        Collections.sort(listToMax);
        return listToMax.get(listToMax.size()-1);
    }

}
