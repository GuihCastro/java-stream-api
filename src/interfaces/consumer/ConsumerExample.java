package interfaces.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        /* Consumer<Integer> printEvenNumbers = number -> {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }; */

        /* numbers.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }
        }); */

        /* numbers.stream().forEach(n -> {
                    if (n % 2 == 0) {
                        System.out.print(n + " ");
                    }
                }
        ); */

        numbers.forEach(n -> {
                    if (n % 2 == 0) {
                        System.out.print(n + " ");
                    }
                }
        );
    }
}
