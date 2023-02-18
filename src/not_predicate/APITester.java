package not_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class APITester {
    public static void main(String[] args) {
        List<String > cityList = Arrays.asList("Patna",
                "Gya","Mokama","Seharsa", "\n", "", "Bokaro");

        List<String> tutorials = cityList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());

        tutorials.forEach(System.out::println);
    }
}
