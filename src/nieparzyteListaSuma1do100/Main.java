package nieparzyteListaSuma1do100;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> liczby = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 1)
                .boxed()
                .collect(Collectors.toList());

        Integer suma = liczby.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(liczby);
        System.out.println("Suma liczb nieparzystych 1 do 100 wynosi: " + suma +".");
    }
}
