package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static task1.Operations.*;

public class Task1 {
    public static void main(String[] args) {
        List  myList = Stream.of(5,4,20,50,13,20).collect(Collectors.toList());
        System.out.println(sorted(myList));
        System.out.println("liczba: " + numberOfElements(myList));
        System.out.println("odrębne: " + distinct(myList));
        System.out.println("minimum: " + minimum(myList));
        System.out.println("maksimum: " + maximum(myList));
    }
}
