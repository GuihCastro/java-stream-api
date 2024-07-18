package interfaces.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> timesTwo = number -> number * 2;

        List<Integer> numbersTimesTwo = numbers.stream()
                .map(timesTwo)
                .toList();

        numbersTimesTwo.forEach(System.out::println);
    }
}
