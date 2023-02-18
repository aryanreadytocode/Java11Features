package collection_to_array;

import java.util.Arrays;
import java.util.List;

public class APITester {

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Chad", "Jon", "Erik", "Aron");
        // old way
        String[] names = namesList.toArray(new String[namesList.size()]);
        System.out.println(names.length);
        // new way
        names = namesList.toArray(String[]::new);
        System.out.println(names.length);
    }
}
