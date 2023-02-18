package new_string_methods;

import java.util.List;
import java.util.stream.Collectors;

public class Tester {

    public static void main(String[] args) {
        String sample = " RAJ ";
        System.out.println(sample.repeat(4));
        System.out.println(sample.isBlank());
        System.out.println("".isBlank());
        System.out.println("  ".isBlank());
        System.out.println(sample.strip());
        System.out.println(sample.stripLeading());
        System.out.println(sample.stripTrailing());

        sample = "This\nis\nmultiline\ntext";

        List<String> list = sample.lines().collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
