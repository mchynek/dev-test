package task3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static task3.EnterData.createEnterData;
import static task3.Graph.printAnswer;

public class Task3 {
    public static void main(String[] args) {

        List <Integer> myList = Stream.of(3,2, 3, 1, 2, 5, 6).collect(Collectors.toList());

        int N = myList.get(0);
        int [][]edges = createEnterData(myList);
        printAnswer(N, edges);
    }
}
