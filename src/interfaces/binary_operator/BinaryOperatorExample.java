package interfaces.binary_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);

        BinaryOperator<Integer> sum = Integer::sum;

        int result = numbers.stream()
                .reduce(0, sum);

        System.out.println("A soma de todos os números da lista é: " + result);
    }
}
