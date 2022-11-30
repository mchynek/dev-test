package task2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static task2.Operations2.pairs;

public class Task2 {
    public static void main(String[] args) {
        List myList = Stream.of(1,2, 10, 7, 5, 3, 6, 6, 13, 0).collect(Collectors.toList());
        List pairs = pairs(myList);
        for(Object p : pairs){
            System.out.println(p);
        }

    }

}
