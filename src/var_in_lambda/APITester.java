package var_in_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class APITester {

    public static void main(String[] args) {
        List<String> cityList = Arrays.asList("Delhi",
                "Mumbai", "Bangalore", "Kolkata",
                "Pune", "Hyderabad");

        String cities = cityList.stream()
                .map((var city) -> city.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(cities);

    }
}
