package interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "TypeScript", "C", "C#", "Go", "Ruby");

        Predicate<String> lessThanFiveChar = word -> word.length() < 5;

        languages.stream()
                .filter(lessThanFiveChar)
                .forEach(System.out::println);
    }
}
