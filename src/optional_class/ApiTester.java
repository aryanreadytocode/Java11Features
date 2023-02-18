package optional_class;

import java.util.Locale;
import java.util.Optional;

public class ApiTester {

    public static void main(String[] args) {
        // before java 8

//        String[] words = new String[10];
//        String word = words[5].toLowerCase(Locale.ROOT);
//        System.out.println(word);

        // after java 8
        String[] words1 = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words1[5]);
        if (checkNull.isPresent()) {
            String word1 = words1[5].toLowerCase(Locale.ROOT);
            System.out.println(word1);
        } else
            System.out.println("word is null");

        // Java 11
        String name = null;
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());
    }
}
