package new_string_methods;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethods {

    public static void main(String[] args) {
        String multilineString = "    My name is Aryan    \r     \n    a developer    \r and explore java     ";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        lines.forEach(System.out::println);

        String love = "I love you Pallavi ";
        love = love.repeat(100);
        love = "  ";
        System.out.println(love.isEmpty());

    }
}
