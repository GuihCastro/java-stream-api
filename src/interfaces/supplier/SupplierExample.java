package interfaces.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greeting = () -> "Hello, World!";

        /* List<String> greetingsList = Stream.generate(greeting)
                .limit(5)
                .collect(Collectors.toList()); */
        List<String> greetingsList = Stream.generate(greeting)
                .limit(5)
                .toList();

        // greetingsList.forEach(g -> System.out.println(g));
        greetingsList.forEach(System.out::println);
    }
}
